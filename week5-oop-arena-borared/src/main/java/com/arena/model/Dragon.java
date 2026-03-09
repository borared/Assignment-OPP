package com.arena.model;

public class Dragon extends Character{

    //constructor
    public Dragon(String name, int health, int attackPower){
        super(name, health, attackPower);
    }

    @Override
    public int attack(){
        return getAttackPower() + 20;
    }
    
}