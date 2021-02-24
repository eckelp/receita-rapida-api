package com.eckelp.receitadigital.mensageria.consumer;

import com.eckelp.receitadigital.mensageria.form.NovaReceitaForm;
import com.eckelp.receitadigital.notificacaoanvisa.dominio.interfaces.ICasoUsoNotificarAnvisaNovaReceita;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class NotificarAnvisaNovaReceitaConsumer  {

    private final ICasoUsoNotificarAnvisaNovaReceita casoUsoNotificadorAnvisa;

    public NotificarAnvisaNovaReceitaConsumer(ICasoUsoNotificarAnvisaNovaReceita casoUsoNotificadorAnvisa) {
        this.casoUsoNotificadorAnvisa = casoUsoNotificadorAnvisa;
    }

    @KafkaListener(topics = "${kafka.topicos.nova-receita}", groupId = "${spring.kafka.consumer.group-id}")
    public void consume(NovaReceitaForm novaReceita){
        this.casoUsoNotificadorAnvisa.notificar(novaReceita);
    }

}
