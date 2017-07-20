package com.epam.lab.decorator;

public class Droid {
    protected String name;
    protected double distance;

    public double fly() {
        return distance;
    }

    public String getName() {
        return name;
    }
}
