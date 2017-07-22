package com.epam.lab.prototype;

import org.apache.log4j.Logger;

public class BattleDroid extends Droid {
    private static Logger LOGGER = Logger.getLogger(BattleDroid.class);

    @Override
    public BattleDroid clone() throws CloneNotSupportedException {
        LOGGER.info(this + " is cloning");
        return (BattleDroid) super.clone();
    }

    @Override
    public String toString() {
        return getName() == null ? "Battle Droid" : getName();
    }
}
