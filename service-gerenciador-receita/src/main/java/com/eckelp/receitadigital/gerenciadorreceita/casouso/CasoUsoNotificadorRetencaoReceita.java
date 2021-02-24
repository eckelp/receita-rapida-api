package com.eckelp.receitadigital.gerenciadorreceita.casouso;

import com.eckelp.receitadigital.gerenciadorreceita.dominio.interfaces.INotificadorRetencaoReceita;
import com.eckelp.receitadigital.mensageria.producer.KafkaProducerService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class CasoUsoNotificadorRetencaoReceita implements INotificadorRetencaoReceita {

    private final KafkaProducerService kafkaProducerService;

    @Value(value = "${kafka.topicos.retencao-receita}")
    private String topico;

    public CasoUsoNotificadorRetencaoReceita(KafkaProducerService kafkaProducerService) {
        this.kafkaProducerService = kafkaProducerService;
    }

    @Override
    public void notificar(Long receitaId) {
        this.kafkaProducerService.send(topico, receitaId);
    }
}
