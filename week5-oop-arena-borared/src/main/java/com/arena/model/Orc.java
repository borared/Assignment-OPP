package com.arena.model;

public class Orc extends Character {

    // constructor used by tests Orc test
    public Orc(String name) {
        super(name, 50, 10); // default stats
    }

    // constructor used by battlefield test
    public Orc(String name, int health, int attackPower) {
        super(name, health, attackPower);
    }

    @Override
    public int attack() {
        return getAttackPower();
    }
}