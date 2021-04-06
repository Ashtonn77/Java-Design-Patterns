package com.strategypattern;

public class Soldier extends Character{
    
    Soldier(){
        weaponBehaviour = new GunBehaviour();
    }
}
