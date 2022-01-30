package com.company.exceptions;

import com.company.characters.Creature;

public class CharacterNotFoundException extends Exception {
    public final String characterName;

    public CharacterNotFoundException(String characterName){
        super("Персонаж \"" + characterName + "\" не был найден.");
        this.characterName = characterName;
    }

    public CharacterNotFoundException(String characterName, String message){
        super(message);
        this.characterName = characterName;
    }

}