package com.company.characters;

import com.company.interfaces.Remindable;
import com.company.places.Place;

public class Mother extends Creature implements Remindable {

    public Mother(String name, Place place){
        super(name, place);
    }

    @Override
    public void remind() {
        System.out.println(this.name + " напомнила убрать свои игрушки.");
    }

    @Override
    public boolean equals(Object obj) {
        return this.name.equals(((Mother)obj).name);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public String toString() {
      return "Mother{" +
                "name='" + name + '\'' +
                '}';

    }
}
