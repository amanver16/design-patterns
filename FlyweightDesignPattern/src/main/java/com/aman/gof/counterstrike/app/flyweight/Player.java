package com.aman.gof.counterstrike.app.flyweight;

/**
 * This interface defines a flyweight through which concrete flyweights
 * (Terrosrist & CounterTerrorist) can recieve and act on extrinsic state.
 * Extrinsic state represents non-sharable state. For example weapon is
 * extrinsic state beccause a player may choose any weapon. Intrinsic state
 * denotes sharable state. For example all terrorist have one common mission -
 * Planting the bomb, so mission is intrinsic state
 */
public interface Player {

    public void assignWeapon(String weapon);

    public void mission();

}