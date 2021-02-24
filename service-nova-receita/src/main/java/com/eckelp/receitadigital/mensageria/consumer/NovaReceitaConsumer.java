package com.eckelp.receitadigital.mensageria.consumer;

import com.eckelp.receitadigital.mensageria.form.NovaReceitaForm;
import com.eckelp.receitadigital.novareceita.casouso.CasoUsoSalvarNovaReceita;
import com.eckelp.receitadigital.novareceita.dominio.interfaces.ICasoUsoSalvarNovaReceita;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class NovaReceitaConsumer {

    private final ICasoUsoSalvarNovaReceita casoUsoSalvarNovaReceita;

    public NovaReceitaConsumer(ICasoUsoSalvarNovaReceita casoUsoSalvarNovaReceita) {
        this.casoUsoSalvarNovaReceita = casoUsoSalvarNovaReceita;
    }

    @KafkaListener(topics = "${kafka.topicos.nova-receita}", groupId = "${spring.kafka.consumer.group-id}")
    public void consume(NovaReceitaForm novaReceita){
        this.casoUsoSalvarNovaReceita.salvar(novaReceita);
    }

}
