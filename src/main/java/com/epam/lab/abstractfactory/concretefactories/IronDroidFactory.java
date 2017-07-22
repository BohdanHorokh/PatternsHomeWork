package com.epam.lab.abstractfactory;

import com.epam.lab.abstractfactory.abstraction.BattleDroid;
import com.epam.lab.abstractfactory.abstraction.DroidFactory;
import com.epam.lab.abstractfactory.abstraction.JumpDroid;
import com.epam.lab.abstractfactory.abstraction.PilotDroid;
import com.epam.lab.abstractfactory.model.IronBattleDroid;
import com.epam.lab.abstractfactory.model.IronJumpDroid;
import com.epam.lab.abstractfactory.model.IronPilotDroid;

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
