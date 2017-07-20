package com.epam.lab.adapter;

public class PolyglotAdapter implements PolyglotDroid {
    private UsualDroid droid;

    public PolyglotAdapter(UsualDroid droid) {
        this.droid = droid;
    }

    public void speakInEnglish() {
        droid.speakMachineLanguage();
    }
}
