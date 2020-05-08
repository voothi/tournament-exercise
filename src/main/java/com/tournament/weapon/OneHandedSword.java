package com.tournament.weapon;

public class OneHandedSword extends SwordWeapon {
    private int dmgPoint;

    public OneHandedSword() {
        this.dmgPoint = 5;
    }

    @Override
    public int getDmgPoint() {
        return dmgPoint;
    }
}
