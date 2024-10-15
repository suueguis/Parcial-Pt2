package org.example.service;

import org.example.domain.Tenis;

import java.util.List;

public interface TenisService {
    void addTenis(Tenis tenis);
    void removeTenis(Long id);
    Tenis getTenis(Long id);
    List<Tenis> getAllTenis();
}