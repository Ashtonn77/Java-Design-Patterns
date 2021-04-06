package com.strategypattern;

public class GunBehaviour implements WeaponBehaviour{
    @Override
    public void useWeapon() {
        System.out.println("Bang! Bang! Bang!");
    }
}
