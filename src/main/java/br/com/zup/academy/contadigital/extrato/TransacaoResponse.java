package br.com.zup.academy.contadigital.extrato;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class TransacaoResponse {
    private TipoOperacao tipoOperacao;
    private TipoTransacao tipoTransacao;
    private BigDecimal valor;
    private LocalDateTime data;

    public TransacaoResponse(Transacao transacao) {
        this.tipoOperacao = transacao.getTipoOperacao();
        this.tipoTransacao = transacao.getTipoTransacao();
        this.valor = transacao.getValor();
        this.data = transacao.getData();
    }

    public TipoOperacao getTipoOperacao() {
        return tipoOperacao;
    }

    public TipoTransacao getTipoTransacao() {
        return tipoTransacao;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public LocalDateTime getData() {
        return data;
    }
}
