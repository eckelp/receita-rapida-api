package com.eckelp.receitadigital.gerenciadorreceita.dominio;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Receita {

    private Paciente paciente;
    private Medico medico;
    private List<MedicamentoReceitado> medicamentosReceitados = new ArrayList<>();
    private LocalDateTime dataEmissao = LocalDateTime.now();

}
