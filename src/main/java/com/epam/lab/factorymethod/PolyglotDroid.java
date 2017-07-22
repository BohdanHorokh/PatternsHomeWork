package com.epam.lab.factorymethod;

import org.apache.log4j.Logger;

public class PolyglotDroid implements Droid {
    private static Logger LOGGER = Logger.getLogger(PolyglotDroid.class);

    public void speak() {
        LOGGER.info(this + " can speak all languages!!!");
    }

    @Override
    public String toString() {
        return "PolyglotDroid";
    }
}
