package com.epam.lab.factorymethod;

public class FactoryMethodDemo {
    public static void main(String[] args) {
        testFactoryMethod();
    }

    public static void testFactoryMethod() {
        new DroidSelector().getDroid(DroidType.NoSpeakDroid).speak();
        new DroidSelector().getDroid(DroidType.PolyglotDroid).speak();
        new DroidSelector().getDroid(DroidType.TypicalDroid).speak();
    }
}
