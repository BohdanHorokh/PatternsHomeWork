package com.epam.lab.abstractfactory;

import org.apache.log4j.Logger;

public class PlasticPilotDroid implements PilotDroid {
    private static Logger LOGGER = Logger.getLogger(PlasticPilotDroid.class);

    public void operate() {
        LOGGER.info("Plastic droid is operating the plane");
    }
}
