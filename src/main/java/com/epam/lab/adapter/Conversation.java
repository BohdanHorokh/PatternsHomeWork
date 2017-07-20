package com.epam.lab.adapter;

/**
 * Created by bohdan on 21.07.17.
 */
public class Conversation {
    public static void communicateInEnglish(PolyglotDroid droidOne, PolyglotDroid droidTwo) {
        droidOne.speakInEnglish();
        droidTwo.speakInEnglish();
    }
}
