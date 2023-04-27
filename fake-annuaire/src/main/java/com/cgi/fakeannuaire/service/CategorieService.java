package com.cgi.fakeannuaire.service;

import com.cgi.fakeannuaire.model.Categorie;
import com.cgi.fakeannuaire.repository.CategorieRepository;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Data
@Service
public class CategorieService {
    @Autowired
    private CategorieRepository categorieRepository;

    public List<Categorie> getCategorie() {
        return categorieRepository.findAllByParentNull();
    }

    public Iterable<Categorie> getSubCategorie(Long id) {
        return categorieRepository.findAllByParent(id);
    }
}
