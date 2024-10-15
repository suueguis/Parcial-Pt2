package org.example.repository;

import org.example.domain.Tenis;

import java.util.List;

public interface TenisRepository {
    void save(Tenis tenis);
    void delete(Long id);
    Tenis findById(Long id);
    List<Tenis> findAll();
}