package br.com.zup.academy.contadigital.extrato;

import java.math.BigDecimal;

public class MensagemKafka {
    private String operacao;
    private String transacao;
    private String valor;
    private String data;
    private String cliente;
    private String conta;

    @Deprecated
    public MensagemKafka() {
    }

    public MensagemKafka(String operacao,
                         String transacao,
                         String valor,
                         String data,
                         String cliente,
                         String conta) {
        this.operacao = operacao;
        this.transacao = transacao;
        this.valor = valor;
        this.data = data;
        this.cliente = cliente;
        this.conta = conta;
    }

    public String getOperacao() {
        return operacao;
    }

    public String getTransacao() {
        return transacao;
    }

    public String getValor() {
        return valor;
    }

    public String getData() {
        return data;
    }

    public String getCliente() {
        return cliente;
    }

    public String getConta() {
        return conta;
    }

    public Transacao paraTransacao() {
        TipoOperacao tipoOperacao = TipoOperacao.valueOf(this.operacao);
        TipoTransacao tipoTransacao = TipoTransacao.valueOf(this.transacao);
        return new Transacao(tipoOperacao,
                tipoTransacao,
                new BigDecimal(valor),
                Long.valueOf(this.cliente),
                this.conta);
    }
}
