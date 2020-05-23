package com.example.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.example.dao.MutuelRepository;
import com.example.dao.UtilisateurRepository;
import com.example.models.Mutuel;
import com.example.models.Utilisateur;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class UtilisateurService {

    @Autowired
    private UtilisateurRepository utilisateurRepository;

    public List<Utilisateur> getAll() {
        return utilisateurRepository.findAll();
    }

    
}