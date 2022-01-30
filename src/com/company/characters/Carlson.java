package com.company.characters;

import com.company.interfaces.Comfortable;
import com.company.places.Place;

public class Carlson extends Creature implements Comfortable {

    public Carlson(String name, Place place){
        super(name, place);
    }

    public void lye(){
        System.out.println(this.name + " облокотился о подушку.");
    }

    public void leaning(){
        System.out.println(this.name + " сопит.");
    }

    public void ask(){
        System.out.println(this.name + " попросил убраться.");
    }

    public class Toy{
        private String nickname;

        Toy(String nickname){
            this.nickname = nickname;
        }
        void printNickname() {
            System.out.println("Игрушка по имени -", this.nickname);
        }
    }

    @Override
    public void comfort(Place place) {
        System.out.println(this.name + " уютно устроился.");
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
        return "Carlson{" +
                "name='" + name + '\'' +
                '}';
    }
}
