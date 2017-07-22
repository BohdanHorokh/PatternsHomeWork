package com.epam.lab.abstractfactory;

import com.epam.lab.abstractfactory.abstraction.BattleDroid;
import com.epam.lab.abstractfactory.abstraction.DroidFactory;
import com.epam.lab.abstractfactory.abstraction.JumpDroid;
import com.epam.lab.abstractfactory.abstraction.PilotDroid;
import com.epam.lab.abstractfactory.model.TitaniumBattleDroid;
import com.epam.lab.abstractfactory.model.TitaniumJumpDroid;
import com.epam.lab.abstractfactory.model.TitaniumPilotDroid;

public class TitaniumDroidFactory implements DroidFactory {
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
