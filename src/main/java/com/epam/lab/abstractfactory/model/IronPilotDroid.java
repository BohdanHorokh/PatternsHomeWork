package com.epam.lab.abstractfactory;

import org.apache.log4j.Logger;

/**
 * Created by bohdan on 19.07.17.
 */
public class IronPilotDroid implements  PilotDroid {
    private static Logger LOGGER = Logger.getLogger(PlasticPilotDroid.class);

    public void operate() {
        LOGGER.info("Iron droid is operating the plane");
    }
}
