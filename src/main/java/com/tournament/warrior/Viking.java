package com.tournament.warrior;

public class Viking implements Warrior {

    private int hitPoints;

    public Viking equip(String type) {
        return null;
    }

    public int hitPoints() {
        return getHitPoints();
    }

    public int getHitPoints() {
        return hitPoints;
    }
}
