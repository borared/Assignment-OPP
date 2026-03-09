package com.arena.engine;

import com.arena.model.Character;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Battlefield {

    private List<Character> heroes;
    private List<Character> monsters;
    private Random random;

    public Battlefield(List<Character> heroes, List<Character> monsters, Random random) {
        this.heroes = heroes;
        this.monsters = monsters;
        this.random = random;
    }

    public void startBattle() {

        while (isTeamAlive(heroes) && isTeamAlive(monsters)) {

            boolean heroTurn = random.nextBoolean();

            Character attacker;
            Character target;

            if (heroTurn) {
                attacker = getRandomCharacter(getAliveCharacters(heroes));
                target = getRandomCharacter(getAliveCharacters(monsters));
            } else {
                attacker = getRandomCharacter(getAliveCharacters(monsters));
                target = getRandomCharacter(getAliveCharacters(heroes));
            }

            fight(attacker, target);
        }

        

        if (isTeamAlive(heroes)) {
            System.out.println("Heroes Win!");
        } else {
            System.out.println("Monsters Win!");
        }
    }

    private void fight(Character attacker, Character target) {

        int damage = attacker.attack();

        target.takeDamage(damage);

    }

    private boolean isTeamAlive(List<Character> team) {
    for (Character c : team) {
        if (c.isAlive()) {
            return true;
        }
    }
    return false;
    }

    private List<Character> getAliveCharacters(List<Character> team) {
    List<Character> alive = new ArrayList<>();

    for (Character c : team) {
        if (c.isAlive()) {
            alive.add(c);
        }
    }

    return alive;
    }


    private Character getRandomCharacter(List<Character> characters) {
        return characters.get(random.nextInt(characters.size()));
    }
}