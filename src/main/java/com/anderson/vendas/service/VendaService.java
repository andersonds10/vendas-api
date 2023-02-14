package com.anderson.vendas.service;

import com.anderson.vendas.model.Venda;
import com.anderson.vendas.repository.VendaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VendaService {
    @Autowired
    private VendaRepository vendaRepository;

    public Venda salvar() {

        var novaVenda = new Venda();
        novaVenda.setId(1L);
        novaVenda.setValor(25.5);
        novaVenda.setVendedorNome("And");

        return vendaRepository.save(novaVenda);
    }
}
