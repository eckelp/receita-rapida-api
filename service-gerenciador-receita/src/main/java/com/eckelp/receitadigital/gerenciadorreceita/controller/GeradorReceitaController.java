package com.eckelp.receitadigital.gerenciadorreceita.controller;

import com.eckelp.receitadigital.gerenciadorreceita.dominio.interfaces.INotificadorNovaReceita;
import com.eckelp.receitadigital.gerenciadorreceita.dominio.interfaces.INotificadorRetencaoReceita;
import com.eckelp.receitadigital.gerenciadorreceita.dominio.interfaces.INovaReceita;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/receita")
public class GeradorReceitaController {

    private final INotificadorNovaReceita notificadorNovaReceita;
    private final INotificadorRetencaoReceita notificadorRetencaoReceita;

    public GeradorReceitaController(INotificadorNovaReceita notificadorNovaReceita, INotificadorRetencaoReceita notificadorRetencaoReceita) {
        this.notificadorNovaReceita = notificadorNovaReceita;
        this.notificadorRetencaoReceita = notificadorRetencaoReceita;
    }

    @PostMapping
    public ResponseEntity<?> gerarNovaReceita(@RequestBody INovaReceita form){

        this.notificadorNovaReceita.notificar(form);

        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @PutMapping("/reter/{receitaId}")
    public ResponseEntity<?> reterReceita(@PathVariable Long receitaId) {
        this.notificadorRetencaoReceita.notificar(receitaId);

        return ResponseEntity.ok().build();
    }

}
