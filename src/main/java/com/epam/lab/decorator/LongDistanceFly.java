package com.epam.lab.decorator;

public class LongDistanceFly extends DecoratorDroid {
    public LongDistanceFly(Droid droid) {
        super(droid);
    }

    @Override
    public double fly() {
        return 1000 + super.fly();
    }

    @Override
    public String toString() {
        return droid + " was modified to fly long distance";
    }
}
