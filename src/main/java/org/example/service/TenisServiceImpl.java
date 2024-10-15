package org.example.service;

import org.example.domain.Tenis;
import org.example.repository.TenisRepository;
import org.example.repository.JpaTenisRepository;

import java.util.List;

public class TenisServiceImpl implements TenisService {
    private TenisRepository tenisRepository;

    public TenisServiceImpl() {
        this.tenisRepository = new JpaTenisRepository();
    }

    @Override
    public void addTenis(Tenis tenis) {
        tenisRepository.save(tenis);
    }

    @Override
    public void removeTenis(Long id) {
        tenisRepository.delete(id);
    }

    @Override
    public Tenis getTenis(Long id) {
        return tenisRepository.findById(id);
    }

    @Override
    public List<Tenis> getAllTenis() {
        return tenisRepository.findAll();
    }
}