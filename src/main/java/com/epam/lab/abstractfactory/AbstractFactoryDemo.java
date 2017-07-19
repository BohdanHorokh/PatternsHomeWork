package com.epam.lab.abstractfactory;

/**
 * Created by bohdan on 19.07.17.
 */
public class AbstractFactoryDemo {
    public static void main(String[] args) {
        runIronDroidFactory();
        runPlasticDroidFactory();
        runTitaniumDroidFactory();
    }

    public static void runIronDroidFactory(){
        DroidFactory factory = new IronDroidFactory();
        PilotDroid pilotDroid = factory.createPilotDroid();
        BattleDroid battleDroid = factory.createBattleDroid();
        JumpDroid jumpDroid = factory.createJumpDroid();
        pilotDroid.operate();
        battleDroid.shoot();
        jumpDroid.startJump();
        jumpDroid.stopJump();
    }
    public static void runPlasticDroidFactory() {
        DroidFactory factory = new PlasticDroidFactory();
        PilotDroid pilotDroid = factory.createPilotDroid();
        BattleDroid battleDroid = factory.createBattleDroid();
        JumpDroid jumpDroid = factory.createJumpDroid();
        pilotDroid.operate();
        battleDroid.shoot();
        jumpDroid.startJump();
        jumpDroid.stopJump();
    }

    public static void runTitaniumDroidFactory () {
        DroidFactory factory = new TitaniumDroidFactory();
        PilotDroid pilotDroid = factory.createPilotDroid();
        BattleDroid battleDroid = factory.createBattleDroid();
        JumpDroid jumpDroid = factory.createJumpDroid();
        pilotDroid.operate();
        battleDroid.shoot();
        jumpDroid.startJump();
        jumpDroid.stopJump();
    }
}