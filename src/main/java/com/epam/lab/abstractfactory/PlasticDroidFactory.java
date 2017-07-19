package com.epam.lab.abstractfactory;

/**
 * Created by bohdan on 19.07.17.
 */
public class PlasticDroidFactory implements DroidFactory {
    public PilotDroid createPilotDroid() {
        return new PlasticPilotDroid();
    }

    public BattleDroid createBattleDroid() {
        return new PlasticBattleDroid();
    }

    public JumpDroid createJumpDroid() {
        return new PlasticJumpDroid();
    }
}
