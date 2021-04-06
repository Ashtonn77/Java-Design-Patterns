package com.strategypattern;

public class SwordBehavior implements WeaponBehaviour{
    @Override
    public void useWeapon() {
        System.out.println("Slash! Slash! Slash!");
    }
}
