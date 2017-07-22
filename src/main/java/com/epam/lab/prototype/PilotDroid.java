package com.epam.lab.prototype;

import org.apache.log4j.Logger;

public class PilotDroid extends Droid {
    private static Logger LOGGER = Logger.getLogger(PilotDroid.class);

    @Override
    public PilotDroid clone() throws CloneNotSupportedException {
        LOGGER.info(this + " is cloning");
        return (PilotDroid) super.clone();
    }

    @Override
    public String toString() {
        return getName() == null ? "Pilot Droid" : getName();
    }
}
