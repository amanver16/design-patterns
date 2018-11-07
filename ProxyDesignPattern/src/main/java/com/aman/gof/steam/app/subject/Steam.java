package com.aman.gof.steam.app.subject;

/**
 * This interface represents the subject which defines a common interface for
 * Real Subject (CsGo) and proxy (CsGoProxy), so that the proxy can be used
 * anywhere(eg: SteamClient) to use the real subject (Cs Go)
 */
public interface Steam {

    public void launchGame();

}