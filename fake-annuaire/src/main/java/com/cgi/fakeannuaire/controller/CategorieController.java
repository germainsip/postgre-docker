package com.cgi.fakeannuaire.controller;

import com.cgi.fakeannuaire.model.Categorie;
import com.cgi.fakeannuaire.service.CategorieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CategorieController {
    @Autowired
    private CategorieService categorieService;

    @GetMapping("/categories/")
    public Iterable<Categorie> getCategories() {
        return categorieService.getCategorie();
    }

    @GetMapping("/categories/{id}")
    public Iterable<Categorie> getSubCategories(@PathVariable Long id) {
        return categorieService.getSubCategorie(id);
    }
}
