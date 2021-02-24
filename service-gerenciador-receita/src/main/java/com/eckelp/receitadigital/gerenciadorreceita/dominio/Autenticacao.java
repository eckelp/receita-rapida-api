package com.eckelp.receitadigital.gerenciadorreceita.dominio;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Autenticacao {

    private String assinatura;
    private String carimbo;
}
