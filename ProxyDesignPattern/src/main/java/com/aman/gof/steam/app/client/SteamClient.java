package com.aman.gof.steam.app.client;

import com.aman.gof.steam.app.proxy.CsGoProxy;
import com.aman.gof.steam.app.subject.Steam;

/**
 * This class represents the client which uses the proxy (CsGoProxy) object to
 * make use of real subject (Cs Go) whenever required. The client have no
 * knowledge of real subject, it only knows about proxy.
 */
public class SteamClient {

    public static void main(String[] args) {

        System.out.println("Sending request to steam server...");
        System.out.println("Connecting to Counter Strike: Global Offensive on steam server...");
        Steam csGoRequest = new CsGoProxy();
        System.out.println("Connected to Counter Strike: Global Offensive via Steam.");
        csGoRequest.launchGame();

    }

}