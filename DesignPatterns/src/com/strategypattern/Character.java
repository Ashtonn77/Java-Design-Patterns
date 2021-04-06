package com.strategypattern;

public class Character {
    
    WeaponBehaviour weaponBehaviour;
    
    void performAttack(){
        weaponBehaviour.useWeapon();
    }
    
    void setWeaponBehaviour(WeaponBehaviour weaponBehaviour){
        this.weaponBehaviour = weaponBehaviour;
    }
    
}
