package com.maradiojava.apirest.service;

import com.maradiojava.apirest.exception.ConflictException;
import com.maradiojava.apirest.model.Album;
import com.maradiojava.apirest.repository.AlbumRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
    public class AlbumService{
        public static final Integer PAGE_SIZE_MIN = 10;
        public static final Integer PAGE_SIZE_MAX = 100;
        public static final Integer PAGE_MIN = 0;

@Autowired
        private AlbumRepository albumRepository;

    public Album ajouterAlbum(Album album) throws ConflictException {
        if (albumRepository.findByTitle(album.getTitle()) != null){
            throw new ConflictException(album.getTitle() + " existe déjà");
        }

        return albumRepository.save(album);
    }


    public void supprimerAlbum(Integer id) {

        albumRepository.delete(id);
    }
}
