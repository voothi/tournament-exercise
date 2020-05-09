package com.tournament.weapon;

public class Buckler implements PersonalArmour {
    private final int AXE_BLOW_MAX = 3;
    private boolean active;
    private int axeBlowLeft;

    public Buckler() {
        this.active = true;
        this.axeBlowLeft = AXE_BLOW_MAX;
    }

    /*
     * Buckler принял удар от оружия weapon
     * возвратил отразить удар repel blow
     *
     * */
    public Buckler repelBlow(Weapon weapon) {
        if (weapon instanceof AxeWeapon) {
            axeBlowLeft--;
        }
        return this;
    }
}
