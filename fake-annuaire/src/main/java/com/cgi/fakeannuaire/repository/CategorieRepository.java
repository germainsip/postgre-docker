package com.cgi.fakeannuaire.repository;

import com.cgi.fakeannuaire.model.Categorie;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CategorieRepository extends CrudRepository<Categorie, Long> {


    List<Categorie> findAllByParentNull();

    Iterable<Categorie> findAllByParent(Long id);
}
