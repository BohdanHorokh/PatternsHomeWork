package com.epam.lab.abstractfactory;

import org.apache.log4j.Logger;

/**
 * Created by bohdan on 19.07.17.
 */
public class PlasticJumpDroid implements  JumpDroid{
    private static Logger LOGGER = Logger.getLogger(PlasticPilotDroid.class);

    public void startJump() {
        LOGGER.info("Plastic droid is jumping");
    }

    public void stopJump() {
        LOGGER.info("Plastic droid doesn`t move ");
    }
}
