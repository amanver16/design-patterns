package com.aman.gof.counterstrike.app;

import com.aman.gof.counterstrike.app.colleague.Player;
import com.aman.gof.counterstrike.app.concretecolleague.Altair;
import com.aman.gof.counterstrike.app.concretecolleague.ProMax;
import com.aman.gof.counterstrike.app.concretecolleague.Sam;
import com.aman.gof.counterstrike.app.concretecolleague.Vertigo;
import com.aman.gof.counterstrike.app.concretecolleague.Wizard;
import com.aman.gof.counterstrike.app.concretemediator.Gameplay;
import com.aman.gof.counterstrike.app.mediator.RadioCommand;

public class CounterStrikeRadioChat {

    public static void main(String[] args) {

        // Create mediator (gameplay) object
        RadioCommand inGameRadioCommand = new Gameplay();

        // Create players to be added in gameplay
        Player altair = new Altair(inGameRadioCommand);
        Player vertigo = new Vertigo(inGameRadioCommand);
        Player sam = new Sam(inGameRadioCommand);
        Player wizard = new Wizard(inGameRadioCommand);
        Player proMax = new ProMax(inGameRadioCommand);

        // Add players to gameplay i.e. mediator
        inGameRadioCommand.addPlayer(altair);
        inGameRadioCommand.addPlayer(vertigo);
        inGameRadioCommand.addPlayer(sam);
        inGameRadioCommand.addPlayer(wizard);
        inGameRadioCommand.addPlayer(proMax);

        // Sending message
        altair.sendRadioMessage(altair, "Bombsite B", "Enemy Spotted !!!");
        vertigo.sendRadioMessage(vertigo, "Bombsite A", "Need Backup !!!");
        sam.sendRadioMessage(sam, "Mid", "Stick Together Team !!!");
        wizard.sendRadioMessage(wizard, "T-Spawn", "Go Go Go !!!");
        proMax.sendRadioMessage(proMax, "CT-Spawn", "Sector Clear !!!");

    }

}