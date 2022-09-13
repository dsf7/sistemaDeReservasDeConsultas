package com.example.sistemaDeReservasDeConsultas.entity;

import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class PacienteEntity extends BaseEntity {

    private String nome;
    private String sobrenome;
    private String endereco;
    private String rg;
    private Date dataDeAlta;

    public PacienteEntity(Long id, String nome, String sobrenome, String endereco, String rg, Date dataDeAlta) {
        super.id = id;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.endereco = endereco;
        this.rg = rg;
        this.dataDeAlta = dataDeAlta;
    }
    
}