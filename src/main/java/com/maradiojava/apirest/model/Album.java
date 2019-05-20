package com.maradiojava.apirest.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;

@Entity
@Table(name = "Album")
public class Album {

    @ManyToOne
    @JsonBackReference

    @JoinColumn(name = "ArtistId")
    private Artist artist;

    @Id
    @Column(name = "AlbumId")
    private Integer id;

    @Column(name = "Title")
    private String Title;

    public Album() {

    }

    public Album(Artist artist, Integer id, String Title) {
        this.artist = artist;
        this.id = id;
        this.Title = Title;

    }
    public Artist getArtist() {
        return artist;
    }

    public void setArtist(Artist artist) {
        this.artist = artist;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String Title) {
        this.Title = Title;
    }

}