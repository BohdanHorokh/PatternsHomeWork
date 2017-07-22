package com.epam.lab.abstractfactory;

import com.epam.lab.abstractfactory.abstraction.BattleDroid;
import com.epam.lab.abstractfactory.abstraction.DroidFactory;
import com.epam.lab.abstractfactory.abstraction.JumpDroid;
import com.epam.lab.abstractfactory.abstraction.PilotDroid;
import com.epam.lab.abstractfactory.model.PlasticBattleDroid;
import com.epam.lab.abstractfactory.model.PlasticJumpDroid;
import com.epam.lab.abstractfactory.model.PlasticPilotDroid;

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
