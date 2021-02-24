package com.eckelp.receitadigital.notificacaoanvisa.casouso;

import com.eckelp.receitadigital.notificacaoanvisa.dominio.interfaces.ICasoUsoNotificarAnvisaNovaReceita;
import org.springframework.stereotype.Service;

@Service
public class CasoUsoNotificarAnvisaNovaReceita implements ICasoUsoNotificarAnvisaNovaReceita {

    @Override
    public void notificar(Object novaReceita){
        System.out.println("===========================================");
        System.out.println("Notificando anvisa sobre nova receita");
        System.out.println(novaReceita);
    }

}
