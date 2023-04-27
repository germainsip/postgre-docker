package com.cgi.fakeannuaire.model;

import javax.persistence.*;
import java.io.Serializable;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity
@Table(name = "categorie")
public class Categorie implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="categorie_sequence")
    @SequenceGenerator(name="categorie_sequence", sequenceName="categorie_sequence", allocationSize=100)
    private Long id;
    
    @Column(name="name")
    private String name;

    @Column(name="parent")
    private Long parent;

}