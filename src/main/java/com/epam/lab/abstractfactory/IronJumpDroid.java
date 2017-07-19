package com.epam.lab.abstractfactory;

import org.apache.log4j.Logger;

/**
 * Created by bohdan on 19.07.17.
 */
public class IronJumpDroid implements  JumpDroid {
    private static Logger LOGGER = Logger.getLogger(PlasticPilotDroid.class);

    public void startJump() {
        LOGGER.info("Iron droid is jumping");
    }

    public void stopJump() {
        LOGGER.info("Iron droid doesn`t move ");
    }
}
