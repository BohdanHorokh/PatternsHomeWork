package com.epam.lab.abstractfactory;

import org.apache.log4j.Logger;

/**
 * Created by bohdan on 19.07.17.
 */
public class TitaniumJumpDroid implements  JumpDroid {
    private static Logger LOGGER = Logger.getLogger(PlasticPilotDroid.class);

    public void startJump() {
        LOGGER.info("Titanium droid is jumping");
    }

    public void stopJump() {
        LOGGER.info("Titanium droid doesn`t move ");
    }
}
