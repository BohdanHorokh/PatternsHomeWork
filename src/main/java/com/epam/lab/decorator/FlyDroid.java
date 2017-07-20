package com.epam.lab.decorator;

public class FlyDroid extends Droid {
    private static double DISTANCE = 1000;

    public FlyDroid(String name) {
        this.name = name;
        distance = DISTANCE;
    }

    @Override
    public String toString() {
        return name;
    }
}
