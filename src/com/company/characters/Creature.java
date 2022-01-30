package com.company.characters;

import com.company.places.Place;

import java.util.Objects;

public abstract class Creature {

    protected String name;
    protected Place place;

    public String getName(){
        return name;
    }

    public String getPlace(){
        return place.getName();
    }

    public Creature(String name, Place place){
        this.name = name;
        this.place = place;
    }

    public void moveToPlace(Place place){
        place.leave(this);
        place.come(this);
        this.place = place;
    }

}
