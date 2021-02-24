package com.eckelp.receitadigital.gerenciadorreceita.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class KafkaTopicConfig {

    @Value(value = "${kafka.topicos.nova-receita}")
    private String topicoNovaReceita;

    @Value(value = "${kafka.topicos.retencao-receita}")
    private String topicoRetencaoReceita;

    @Bean
    public NewTopic topicNovaReceita(){
        return new NewTopic(topicoNovaReceita, 1, (short) 1);
    }


    @Bean
    public NewTopic topicRetencaoReceita(){
        return new NewTopic(topicoRetencaoReceita, 1, (short) 1);
    }

}
