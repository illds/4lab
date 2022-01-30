package com.neevin.exceptions;

public class DesireToCleanOutOfRangeError extends Error {
    public DesireToCleanOutOfRangeError(){
        super("MoodType вышел за границы!");
    }
}