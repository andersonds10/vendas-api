package com.anderson.vendas.controller;

import com.anderson.vendas.model.Venda;
import com.anderson.vendas.service.VendaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/venda")
public class VendaController {

    @Autowired
    private VendaService vendaService;

    @PostMapping("/salvar")
    public Venda salvarVenda() {
        return vendaService.salvar();
    }

    @GetMapping("/teste2")
    private String getVenda2() {
        return "Venda Realizada";
    }

}