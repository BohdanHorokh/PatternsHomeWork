package com.epam.lab.adapter;

import org.apache.log4j.Logger;

public class SmartDroid implements PolyglotDroid {
    private static Logger LOGGER = Logger.getLogger(UsualDroid.class);

    public void speakInEnglish() {
        LOGGER.info("I can speak English language");
    }
}
