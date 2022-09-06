package com.example.sistemaDeReservasDeConsultas.service;

import java.util.List;
import java.util.Optional;

public interface IDentistaService <T> {

    public List<T> getAll();
    public Optional<T> getById(int id);
    public T add(T t);
    public void update(T t);
    public void remove(int id);
    
}
