package com.anderson.vendas.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "venda")
public class Venda {
    @Id
    private Long id;
    @Column(name = "valor")
    private Double valor;
    @Column(name = "vendedor_nome")
    private String vendedorNome;
}
