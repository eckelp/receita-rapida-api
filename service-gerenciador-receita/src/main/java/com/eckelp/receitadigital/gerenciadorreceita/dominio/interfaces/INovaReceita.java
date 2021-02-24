package com.eckelp.receitadigital.gerenciadorreceita.dominio.interfaces;

import com.eckelp.receitadigital.mensageria.form.NovaReceitaForm;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import java.time.LocalDateTime;
import java.util.List;

@JsonDeserialize(as = NovaReceitaForm.class)
public interface INovaReceita {

    Long getPacienteId();
    Long getMedicoId();
    List<Long> getMedicamentosReceitados();
    LocalDateTime getDataEmissao();

}
