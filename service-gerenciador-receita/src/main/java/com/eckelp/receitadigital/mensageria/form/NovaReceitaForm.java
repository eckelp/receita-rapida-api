package com.eckelp.receitadigital.mensageria.form;

import com.eckelp.receitadigital.gerenciadorreceita.dominio.interfaces.INovaReceita;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class NovaReceitaForm implements INovaReceita {

    private Long pacienteId;
    private Long medicoId;
    private List<Long> medicamentosReceitados = new ArrayList<>();
    private LocalDateTime dataEmissao = LocalDateTime.now();

}
