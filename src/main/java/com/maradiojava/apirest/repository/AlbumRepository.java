package com.maradiojava.apirest.repository;

import com.maradiojava.apirest.model.Album;
import org.springframework.data.jpa.repository.JpaRepository;


public interface AlbumRepository extends JpaRepository <Album, Integer> {
    Album findByTitle (String title);
}
