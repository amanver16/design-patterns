package com.aman.gof.steam.app.proxy;

import com.aman.gof.steam.app.realsubject.CsGo;
import com.aman.gof.steam.app.subject.Steam;

/**
 * This class represents the proxy and creates instance of real subject (Cs Go).
 * It recieves request from client (Steam Client) and delegates to the real
 * subject (Cs Go).
 */
public class CsGoProxy implements Steam {

    private CsGo csGo;

    @Override
    public void launchGame() {
        csGo = new CsGo();
        System.out.println("Preparing to launch Counter Strike: Global Offensive");
        csGo.launchGame();
    }

}