package com.maradiojava.apirest.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.persistence.EntityNotFoundException;


@RestControllerAdvice //Obligatoire pour gérer les ExceptionHandler
public class GlobalExceptionHandler {
    @ExceptionHandler(ConflictException.class) //Fait appel à la classe ExceptionHandler
    @ResponseStatus(HttpStatus.CONFLICT) // Correspond au type d'erreur CONFLICT

    public String gestionDesConflits (ConflictException c){ // "gestionDesConflits" => Nom de la méthode -
                                                            // "ConflictException" => Nom de la Classe
                                                            // "c" => Instanciation de la Classe "ConflictException"
        return c.getMessage();                              // Fait appel à la méthode getMessage() de la classe "ConflictException"
    }

}
