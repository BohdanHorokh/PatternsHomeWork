package com.epam.lab.prototype;

import java.util.HashMap;
import java.util.Map;

public class DroidPrototypes {
    private static Map<String, Droid> droids = new HashMap<String, Droid>();

    static {
        droids.put(DroidType.JUMPDROID, new JumpDroid());
        droids.put(DroidType.BATTLEDROID, new BattleDroid());
        droids.put(DroidType.PILOTDROID, new PilotDroid());
    }

    public static Droid getPrototype(final String droidType) throws CloneNotSupportedException {
        return (Droid) (droids.get(droidType).clone());
    }
}
