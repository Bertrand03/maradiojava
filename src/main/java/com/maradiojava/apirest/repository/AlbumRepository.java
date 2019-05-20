package com.maradiojava.apirest.repository;

import com.maradiojava.apirest.model.Album;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AlbumRepository extends JpaRepository <Album, Integer> {
    //List<Album> findByTitle(String Title);
}
