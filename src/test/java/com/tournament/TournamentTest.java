package com.tournament;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * This is a duel simulation
 * Blow exchange are sequential, A engage B means that A will give the first blow, then B will respond and continue till the death
 */
class TournamentTest {

    /**
     * A Swordsman has 100 hit points and use a 1 hand sword that does 5 dmg
     * A Viking has 120 hit points and use a 1 hand axe that does 6 dmg
     */
    @Test
    void testSwordsmanVsViking() {
        Swordsman swordsman = new Swordsman();
        Viking viking = new Viking();

        swordsman.engage(viking);

        assertEquals(0, swordsman.hitPoints());
        assertEquals(35, viking.hitPoints());
    }

    /**
     * a buckler cancel all the damages of a blow one time out of two
     * a buckler is destroyed after blocking 3 blow from an axe
     */
    @Test
    void testSwordsmanWithBucklerVsVikingWithBuckler()
    {
        Swordsman swordsman = (new Swordsman()).equip("buckler");
        Viking viking = (new Viking()).equip("buckler");

        swordsman.engage(viking);

        assertEquals(0, swordsman.hitPoints());
        assertEquals(70, viking.hitPoints());
    }

    /**
     * an Highlander as 150 hit points and fight with a Great Sword
     * a Great Sword is a two handed sword deliver 12 damages, but can attack only 2 every 3)(attack ; attack ; no attack)
     * an armor : reduce all received damages by 3 & reduce delivered damages by one
     */
    @Test
    void testArmoredSwordsmanVsViking()
    {
        Highlander highlander = new Highlander();
        Swordsman swordsman = (new Swordsman())
            .equip("buckler")
            .equip("armor");

        swordsman.engage(highlander);

        assertEquals(0, swordsman.hitPoints());
        assertEquals(10, highlander.hitPoints());
    }

    /**
     * a vicious Swordsman is a Swordsman that put poison on his weapon.
     * poison add 20 damages on two first blows
     * a veteran Highlander goes Berserk once his hit points are under 30% of his initial total
     * once Berserk, he doubles his damages
     */
    @Test
    void testViciousSwordsmanVsVeteranHighlander()
    {
        Swordsman swordsman = (new Swordsman("Vicious"))
            .equip("axe")
            .equip("buckler")
            .equip("armor");

        Highlander highlander = new Highlander("Veteran");

        swordsman.engage(highlander);

        assertEquals(1, swordsman.hitPoints());
        assertEquals(0, highlander.hitPoints());
    }
}
