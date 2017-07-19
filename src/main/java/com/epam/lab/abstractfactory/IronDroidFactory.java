package com.epam.lab.abstractfactory;

/**
 * Created by bohdan on 19.07.17.
 */
public class IronDroidFactory implements DroidFactory {
    public PilotDroid createPilotDroid() {
        return new IronPilotDroid();
    }

    public BattleDroid createBattleDroid() {
        return new IronBattleDroid();
    }

    public JumpDroid createJumpDroid() {
        return new IronJumpDroid();
    }
}
