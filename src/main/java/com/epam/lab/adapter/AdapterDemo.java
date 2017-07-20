package com.epam.lab.adapter;

import static com.epam.lab.adapter.Conversation.communicateInEnglish;

public class AdapterDemo {
    public static void main(String[] args) {
        testSAdapter();
    }

    public static void testSAdapter() {
        UsualDroid usualDroid = new UsualDroid();
        PolyglotAdapter adapter = new PolyglotAdapter(usualDroid);
        PolyglotDroid smartDroid = new SmartDroid();
        communicateInEnglish(smartDroid, adapter);
    }
}
