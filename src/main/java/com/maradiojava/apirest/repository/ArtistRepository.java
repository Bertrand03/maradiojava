package com.maradiojava.apirest.repository;

import com.maradiojava.apirest.Artist;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArtistRepository extends JpaRepository<Artist, Integer>{ //il faut préciser qu'il faut travailler avec le JpaRepository, on précise la classe et le type de la clé primaire
    Artist findById (Integer id);
}
