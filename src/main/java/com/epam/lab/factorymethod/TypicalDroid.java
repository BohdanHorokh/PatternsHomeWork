package com.epam.lab.factorymethod;

import org.apache.log4j.Logger;

public class TypicalDroid implements Droid {
    private static Logger LOGGER = Logger.getLogger(TypicalDroid.class);

    public void speak() {
        LOGGER.info(this + " can speak only machine language!!!");
    }

    @Override
    public String toString() {
        return "TypicalDroid";
    }
}
