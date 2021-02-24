package com.eckelp.receitadigital.mensageria.producer;

import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service(value = "KafkaProducerService")
public class KafkaProducerService  {

    private final KafkaTemplate<String, Object> kafkaTemplate;

    public KafkaProducerService(KafkaTemplate<String, Object> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public void send(String topico, Object mensagem){
        this.kafkaTemplate.send(topico, mensagem);
    }
}
