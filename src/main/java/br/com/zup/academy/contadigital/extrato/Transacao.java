package br.com.zup.academy.contadigital.extrato;

import javax.persistence.*;
import javax.print.DocFlavor;
import javax.validation.constraints.Positive;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "tb_transacoes")
public class Transacao {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private TipoOperacao tipoOperacao;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private TipoTransacao tipoTransacao;

    @Column(nullable = false)
    @Positive
    private BigDecimal valor;

    @Column(nullable = false)
    private LocalDateTime data;

    @Column(nullable = false)
    private Long idCliente;

    @Column(nullable = false)
    private String numeroConta;
    
    @Deprecated
    public Transacao() {
    }

    public Transacao(TipoOperacao tipoOperacao,
                     TipoTransacao tipoTransacao,
                     BigDecimal valor,
                     Long idCliente,
                     String numeroConta) {
        this.tipoOperacao = tipoOperacao;
        this.tipoTransacao = tipoTransacao;
        this.valor = valor;
        this.idCliente = idCliente;
        this.numeroConta = numeroConta;
        this.data = LocalDateTime.now();
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
