package com.eckelp.receitadigital.gerenciadorreceita.casouso;

import com.eckelp.receitadigital.mensageria.producer.KafkaProducerService;
import com.eckelp.receitadigital.gerenciadorreceita.dominio.interfaces.INotificadorNovaReceita;
import com.eckelp.receitadigital.gerenciadorreceita.dominio.interfaces.INovaReceita;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class CasoUsoNotificadorNovaReceita implements INotificadorNovaReceita {


    @Value(value = "${kafka.topicos.nova-receita}")
    private String topico;

    private final KafkaProducerService producer;

    public CasoUsoNotificadorNovaReceita(KafkaProducerService producer) {
        this.producer = producer;
    }

    @Override
    public void notificar(INovaReceita receita) {

        this.producer.send(topico, receita);

    }
}

