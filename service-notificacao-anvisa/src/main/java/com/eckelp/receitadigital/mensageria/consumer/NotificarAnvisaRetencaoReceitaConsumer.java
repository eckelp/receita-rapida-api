package com.eckelp.receitadigital.mensageria.consumer;

import com.eckelp.receitadigital.notificacaoanvisa.dominio.interfaces.ICasoUsoNotificarAnvisaRetencaoReceita;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class NotificarAnvisaRetencaoReceitaConsumer {

    private final ICasoUsoNotificarAnvisaRetencaoReceita notificadorAnvisaRetencaoReceita;

    public NotificarAnvisaRetencaoReceitaConsumer(ICasoUsoNotificarAnvisaRetencaoReceita notificadorAnvisaRetencaoReceita) {
        this.notificadorAnvisaRetencaoReceita = notificadorAnvisaRetencaoReceita;
    }

    @KafkaListener(topics = "${kafka.topicos.retencao-receita}", groupId = "${spring.kafka.consumer.group-id}")
    public void consume(Long receitaId){
        this.notificadorAnvisaRetencaoReceita.notificar(receitaId);
    }

}
