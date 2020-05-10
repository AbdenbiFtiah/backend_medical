package com.example.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.example.dao.MutuelRepository;
import com.example.models.Mutuel;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class MutuelService {

    @Autowired
    private MutuelRepository mutuelRepository;

    public List<Mutuel> getAll() {
        return mutuelRepository.findAll();
    }

    public Page<Mutuel> getAll(Pageable pageable) {
        return mutuelRepository.findAll(pageable);
    }

    public Mutuel getOne(int id) {
        return mutuelRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Mutuel " + id + " not found"));
    }

    @Transactional(rollbackOn = Throwable.class)
    public Mutuel ajouter(Mutuel mutuel) {
        mutuel.setNom(mutuel.getNom().toUpperCase());
        return mutuelRepository.save(mutuel);
    }

    @Transactional(rollbackOn = Throwable.class)
    public Mutuel modifier(int id, String nom) {
        return mutuelRepository.findById(id)
                .map(mutuel -> {
                    mutuel.setNom(nom.toUpperCase());
                    return mutuel;
                }).orElseThrow(() -> new RuntimeException("Mutuel " + id + " not found"));
    }
}