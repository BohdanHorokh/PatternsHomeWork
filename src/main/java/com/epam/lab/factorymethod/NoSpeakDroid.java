package com.epam.lab.factorymethod;

import org.apache.log4j.Logger;

public class NoSpeakDroid implements Droid {
    private static Logger LOGGER = Logger.getLogger(NoSpeakDroid.class);

    public void speak() {
        LOGGER.info(this + " can`t speak !!!");
    }

    @Override
    public String toString() {
        return "NoSpeakDroid";
    }
}
