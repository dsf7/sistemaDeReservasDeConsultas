package com.example.sistemaDeReservasDeConsultas.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.sistemaDeReservasDeConsultas.model.Endereco;

public interface IEnderecoRepository extends JpaRepository<Endereco, Long> { }
