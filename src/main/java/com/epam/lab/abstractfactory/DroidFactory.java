package com.epam.lab.abstractfactory;

public interface DroidFactory {
    PilotDroid createPilotDroid();
    BattleDroid createBattleDroid();
    JumpDroid createJumpDroid();
}
