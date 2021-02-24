package com.eckelp.receitadigital.gerenciadorreceita.dominio;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Medico {

    private String nomeCompleto;
    private String CRM;
    private Endereco endereco;
    private Contato contato;
    private Autenticacao autenticacao;

}
