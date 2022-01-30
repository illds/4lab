package com.company.places;

import com.company.characters.Creature;

import java.util.ArrayList;
import java.util.List;

public class Place {
    protected String placeName;
    List<Creature> creaturesAtPlace = new ArrayList<>();

    public Place(String placeName){
        placeName = placeName;
    }

    public void come(Creature creature){
        System.out.println("В дом зашёл " + creature.getName() + ".");
        creaturesAtPlace.add(creature);
    }

    public void leave(Creature creature){
        creaturesAtPlace.remove(creature);
    }

    public String getName() {
        return placeName;
    }

    public void who(){
        System.out.println("В доме: ");
        for(Creature creature : creaturesAtPlace) {
            System.out.println(creature.getName());
        }
    }
}
