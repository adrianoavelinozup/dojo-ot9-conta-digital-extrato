package br.com.zup.academy.contadigital.extrato;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class TransacaoConsumer {

    @Autowired
    private TransacaoRepository transacaoRepository;

    @KafkaListener(topics = "${spring.kafka.topic.transactions}")
    public void ouvir(MensagemKafka mensagemKafka) {
        Transacao transacao = mensagemKafka.paraTransacao();
        transacaoRepository.save(transacao);
    }
}