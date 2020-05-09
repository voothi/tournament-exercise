package com.tournament;

import com.tournament.warrior.Highlander;
import com.tournament.warrior.Swordsman;
import com.tournament.warrior.Viking;

public class Tournament {
    public void swordsmanVsViking() {
        Swordsman swordsman = new Swordsman();
        Viking viking = new Viking();

        swordsman.engage(viking);
    }

    public void swordsmanWithBucklerVsVikingWithBuckler() {
        Swordsman swordsman = (new Swordsman()).equip("buckler");
        Viking viking = (new Viking()).equip("buckler");

        swordsman.engage(viking);
    }

    public void armoredSwordsmanVsViking() {

    }

    public void viciousSwordsmanVsVeteranHighlander() {

    }

}
