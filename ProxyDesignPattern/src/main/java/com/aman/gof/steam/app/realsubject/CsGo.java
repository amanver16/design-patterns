package com.aman.gof.steam.app.realsubject;

import com.aman.gof.steam.app.subject.Steam;

/**
 * This class represent real subject which implements the subject interface. It
 * is used whenever required by the client with the help of proxy.
 */
public class CsGo implements Steam {

    @Override
    public void launchGame() {
        System.out.println("Counter Strike: Global Offensive is running.");
    }

}