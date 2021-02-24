package com.eckelp.receitadigital.gerenciadorreceita.dominio;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class MedicamentoReceitado {


    private Medicamento medicamento;

    private String dose;
    private String posologia;
    private String quantidade;



}
