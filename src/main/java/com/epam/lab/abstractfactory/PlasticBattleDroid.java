package com.epam.lab.abstractfactory;

import org.apache.log4j.Logger;

/**
 * Created by bohdan on 19.07.17.
 */
public class PlasticBattleDroid implements BattleDroid {
    private static Logger LOGGER = Logger.getLogger(PlasticPilotDroid.class);

    public void shoot() {
        LOGGER.info("Plastic droid is shooting");
    }
}
