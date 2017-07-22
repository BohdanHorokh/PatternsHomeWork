package com.epam.lab.prototype;

import org.apache.log4j.Logger;

public class PrototypeDemo {
    private static Logger LOGGER = Logger.getLogger(PilotDroid.class);

    public static void main(String[] args) {
        testPrototypePattern();
    }

    public static void testPrototypePattern () {
        try {
            Droid battlePrototype = DroidPrototypes.getPrototype(DroidType.BATTLEDROID);
            battlePrototype.setName("Droid Fighter");
            LOGGER.info(battlePrototype);
            Droid jumpbPrototype = DroidPrototypes.getPrototype(DroidType.JUMPDROID);
            LOGGER.info(jumpbPrototype.toString());
            Droid pilotPrototype = DroidPrototypes.getPrototype(DroidType.PILOTDROID);
            LOGGER.info(pilotPrototype.toString());
            Droid pilotPrototypeDroid = DroidPrototypes.getPrototype(DroidType.PILOTDROID);
            LOGGER.info(pilotPrototypeDroid.toString());
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
