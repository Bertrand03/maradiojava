package com.maradiojava.apirest;

public class Album {
    private Integer AlbumId;
    private String Title;
    private Integer ArtistId;

    public Album(Integer albumId, String title, Integer artistId) {
        AlbumId = albumId;
        Title = title;
        ArtistId = artistId;
    }

    public Integer getAlbumId() {
        return AlbumId;
    }

    public void setAlbumId(Integer albumId) {
        AlbumId = albumId;
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
}
