package com.maradiojava.apirest.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;

@Entity
@Table(name = "Album")
public class Album {

    @Id
    @Column(name = "AlbumId")
    private Integer id;

    @Column(name = "Title")
    private String Title;

    @JoinColumn(name = "ArtistId")
    private Integer ArtistId;

    public Album(Integer id, String title, Integer artistId) {
        this.id = id;
        Title = title;
        ArtistId = artistId;
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

    public void setTitle(String title) {
        Title = title;
    }

    public Integer getArtistId() {
        return ArtistId;
    }

    public void setArtistId(Integer artistId) {
        ArtistId = artistId;
    }

    @ManyToOne
    @JsonManagedReference
    private Artist artist;

    public Album(Artist artist) {
        this.artist = artist;
    }

    public Artist getArtist() {
        return artist;
    }

    public void setArtist(Artist artist) {
        this.artist = artist;
    }
}
