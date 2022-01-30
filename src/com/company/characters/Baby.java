package com.company.characters;

import com.company.DesireToClean;
import com.company.interfaces.Cleanable;
import com.company.places.Place;

public class  Baby extends Creature implements Cleanable {
    private DesireToClean desireToClean = DesireToClean.LOW;

    public Baby(String name, Place place){
        super(name, place);
    }

    public void upDesireToClean(){
        if(desireToClean == DesireToClean.LOW){
            desireToClean = DesireToClean.MIDDLE;
            System.out.println("У " + this.name + "а желание убираться возрастает.");
        } else if(desireToClean == DesireToClean.MIDDLE){
            desireToClean = DesireToClean.HIGH;
            System.out.println("У " + this.name + "а желание убираться сильно возрастает.");
        }
    }
    public void downDesireToClean(){
        if(desireToClean == DesireToClean.HIGH){
            desireToClean = DesireToClean.MIDDLE;
            System.out.println("У " + this.name + "а желание убираться падает.");
        } else if(desireToClean == DesireToClean.MIDDLE){
            desireToClean = DesireToClean.LOW;
            System.out.println("У " + this.name + "а желание убираться сильно падает.");
        }
    }

    @Override
    public void clean(){
        if(desireToClean == DesireToClean.HIGH) {
            System.out.println(this.name + " убирается.");
        } else {
            System.out.println(this.name + " не сильно хочет убираться.");
        }
    }

    @Override
    public boolean equals(Object obj) {
        return this.name.equals(((Baby)obj).name);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public String toString() {
        return "Baby{" +
                "name='" + name + '\'' +
                '}';
    }
}
