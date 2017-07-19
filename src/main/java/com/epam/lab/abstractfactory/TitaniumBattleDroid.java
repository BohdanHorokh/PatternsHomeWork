package com.epam.lab.abstractfactory;

import org.apache.log4j.Logger;

/**
 * Created by bohdan on 19.07.17.
 */
public class TitaniumBattleDroid implements BattleDroid {
    private static Logger LOGGER = Logger.getLogger(PlasticPilotDroid.class);

    public void shoot() {
        LOGGER.info("Titanium droid is shooting");
    }
}
