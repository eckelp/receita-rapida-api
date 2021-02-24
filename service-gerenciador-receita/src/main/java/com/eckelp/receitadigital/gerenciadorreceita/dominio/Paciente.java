package com.eckelp.receitadigital.gerenciadorreceita.dominio;

import com.eckelp.receitadigital.gerenciadorreceita.dominio.enums.SexoEnum;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Paciente {

    private String nomeCompleto;
    private int idade;
    private SexoEnum sexo;

}
