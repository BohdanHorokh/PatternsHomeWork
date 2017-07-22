package com.epam.lab.factorymethod;

public class DroidSelector {
    private Droid droid;

    public Droid getDroid(DroidType droidType) {
        switch (droidType) {
            case PolyglotDroid:
                droid = new PolyglotDroid();
                break;
            case NoSpeakDroid:
                droid = new NoSpeakDroid();
                break;
            case TypicalDroid:
                droid = new TypicalDroid();
                break;
        }
        return droid;
    }
}
