package com.aman.gof.phone.app.concretedecorator;

import com.aman.gof.phone.app.decorator.SmartphoneDecorator;

public class VoiceAssistantDecorator implements SmartphoneDecorator {

    @Override
    public void addFeatures() {
        System.out.println("Added voice assistant features.");
    }

}