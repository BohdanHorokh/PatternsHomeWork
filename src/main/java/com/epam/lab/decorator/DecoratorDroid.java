package com.epam.lab.decorator;

public class DecoratorDroid extends Droid {
    protected Droid droid;

    public DecoratorDroid(Droid droid) {
        this.droid = droid;
    }

    @Override
    public double fly() {
        return droid.fly();
    }
}
