package com.epam.lab.abstractfactory;

/**
 * Created by bohdan on 19.07.17.
 */
public class TitaniumDroidFactory implements DroidFactory{
    public PilotDroid createPilotDroid() {
        return new TitaniumPilotDroid();
    }

    public BattleDroid createBattleDroid() {
        return new TitaniumBattleDroid();
    }

    public JumpDroid createJumpDroid() {
        return new TitaniumJumpDroid();
    }
}
