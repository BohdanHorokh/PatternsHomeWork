package com.epam.lab.abstractfactory;

import com.epam.lab.abstractfactory.abstraction.BattleDroid;
import com.epam.lab.abstractfactory.abstraction.JumpDroid;
import com.epam.lab.abstractfactory.abstraction.PilotDroid;

public interface DroidFactory {
    PilotDroid createPilotDroid();
    BattleDroid createBattleDroid();
    JumpDroid createJumpDroid();
}
