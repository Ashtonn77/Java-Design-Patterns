package com.strategypattern;

public class Main {

    public static void main(String[] args) {
        
        Character soldier = new Soldier();
        soldier.performAttack();

        System.out.println("I'm outta ammo, Jimmy! Throw me that sword");
        soldier.setWeaponBehaviour(new SwordBehavior());
        soldier.performAttack();
        
    }
}
