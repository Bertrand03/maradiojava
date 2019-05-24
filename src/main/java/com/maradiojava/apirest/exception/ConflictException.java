package com.maradiojava.apirest.exception;

public class ConflictException extends Throwable{ // Hérite de la classe Throwable qui permet de lancer des exceptions
    public ConflictException(String messageConflict){ // On déclare la méthode ConflictException qui prend en paramètres un message de type String
        super(messageConflict); // On utilise les méthodes issues de l'héritage grâce à super.
    }
}
