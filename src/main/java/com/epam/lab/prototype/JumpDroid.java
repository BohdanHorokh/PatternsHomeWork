package com.epam.lab.prototype;

import org.apache.log4j.Logger;

public class JumpDroid extends Droid {
    private static Logger LOGGER = Logger.getLogger(JumpDroid.class);

    @Override
    public JumpDroid clone() throws CloneNotSupportedException {
        LOGGER.info(this + " is cloning");
        return (JumpDroid) super.clone();
    }

    @Override
    public String toString() {
        return getName() == null ? "Jump Droid" : getName();
    }
}
