package com.eckelp.receitadigital.novareceita.casouso;

import com.eckelp.receitadigital.novareceita.dominio.interfaces.ICasoUsoSalvarNovaReceita;
import org.springframework.stereotype.Service;

@Service
public class CasoUsoSalvarNovaReceita implements ICasoUsoSalvarNovaReceita {

    @Override
    public void salvar(Object novaReceita){
        System.out.println("====================================================================");
        System.out.println("Salvando nova receita...");
        System.out.println(novaReceita);
    }

}
