package com.epam.lab.decorator;

public class FlyUpsideDown extends DecoratorDroid {
    public FlyUpsideDown(Droid droid) {
        super(droid);
    }

    @Override
    public double fly() {
        return super.fly();
    }

    @Override
    public String toString() {
        return droid + " with upside down flying feature";
    }
}
