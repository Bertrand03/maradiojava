package com.maradiojava.apirest.model;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "Artist")
public class Artist {
    @Id
    @Column( name = "ArtistId")
    private Integer id;

    @Column(name = "Name")
    private String name;

    public Artist(){

    }

    public Artist(Integer id, String name) {
        this.id = id;
        name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        name = name;
    }
    @OneToMany(mappedBy = "artist") //on met entre parenthèses après mappedBy, le nom de la table en bdd
    @JsonBackReference
    private List<Album>discographie;

    public List<Album> getDiscographie() {
        return discographie;
    }

    public void setDiscographie(List<Album> discographie) {
        this.discographie = discographie;
    }
}