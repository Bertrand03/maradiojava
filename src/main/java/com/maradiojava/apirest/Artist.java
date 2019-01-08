package com.maradiojava.apirest;

public class Artist {
    private Integer ArtistId;
    private String Name;

    public Artist(Integer artistId, String name) {
        ArtistId = artistId;
        Name = name;
    }

    public Integer getArtistId() {
        return ArtistId;
    }

    public void setArtistId(Integer artistId) {
        ArtistId = artistId;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }
}
