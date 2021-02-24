package com.eckelp.receitadigital.notificacaoanvisa.casouso;

import com.eckelp.receitadigital.notificacaoanvisa.dominio.interfaces.ICasoUsoNotificarAnvisaRetencaoReceita;
import org.springframework.stereotype.Service;

@Service
public class CasoUsoNotificarAnvisaRetencaoReceita implements ICasoUsoNotificarAnvisaRetencaoReceita {

    @Override
    public void notificar(Object receitaId){
        System.out.println("===========================================");
        System.out.println("Notificando anvisa sobre retencao de receita");
        System.out.println(receitaId);
    }

}
