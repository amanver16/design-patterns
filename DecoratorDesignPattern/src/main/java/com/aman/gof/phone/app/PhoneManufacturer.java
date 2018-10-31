package com.aman.gof.phone.app;

import com.aman.gof.phone.app.component.Phone;
import com.aman.gof.phone.app.concretecomponent.BasicPhone;
import com.aman.gof.phone.app.concretedecorator.TouchScreenDecorator;
import com.aman.gof.phone.app.concretedecorator.VoiceAssistantDecorator;

public class PhoneManufacturer {

    public static void main(String[] args) {

        Phone phone = new BasicPhone();
        BasicPhone basicPhone = new BasicPhone();
        phone.addFeatures();
        basicPhone.makeCall();

        Phone touchScreen = new TouchScreenDecorator();
        touchScreen.addFeatures();

        Phone voiceAssistant = new VoiceAssistantDecorator();
        voiceAssistant.addFeatures();

        System.out.println("Smartphone is ready.");
    }

}