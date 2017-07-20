package com.epam.lab.decorator;

import org.apache.log4j.Logger;

public class DecoratorDemo {
    private static Logger LOGGER = Logger.getLogger(DecoratorDemo.class);

    public static void main(String[] args) {
        Droid droid = new FlyDroid("Default Droid");
        LOGGER.info(droid.name + " can fly " + droid.fly() + " km");

        Droid decoratedDroid = new FlyDroid("Default Droid");
        decoratedDroid = new LongDistanceFly(decoratedDroid);
        LOGGER.info(decoratedDroid + " " + decoratedDroid.fly());
        decoratedDroid = new FlyUpsideDown(decoratedDroid);
        LOGGER.info(decoratedDroid + " " + decoratedDroid.fly());
    }
}
