package com.eckelp.receitadigital.mensageria.form;

import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

@Data
public class NovaReceitaForm {

    private Long pacienteId;

    private Long medicoId;

    private List<Long> medicamentosReceitados;

    private LocalDateTime dataEmissao;

}
