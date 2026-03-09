package com.arena.model;

public abstract class Character{
    
    private String name;
    private int health;
    private int attackPower;

    //constructor
    public Character(String name, int health, int attackPower){
        setName(name);
        setHealth(health);
        setAttackPower(attackPower);
    }

    //setter

    public void setAttackPower(int attackPower) {
        if(attackPower > 0){
            this.attackPower = attackPower;
        }else{
            throw new IllegalArgumentException("Attack power must be > 0.");
        }
        
    }
    public void setHealth(int health) {
        if(health >= 0){
            this.health = health;
        }else{
            throw new IllegalArgumentException("Health can not be negative!");
        }
        
    }
    public void setName(String name) {
        if(name != null || !name.isEmpty()){
            this.name = name;
        }else{
            throw new IllegalArgumentException("Name can not be empty.");
        }
    }

    //Getter
    public String getName(){
        return name;
    }
    public int getHealth(){
        return health;
    }
    public int getAttackPower(){
        return attackPower;
    }

    public void takeDamage(int damage){
        this.health = this.health - damage;
        if(health < 0){
            this.health = 0;
        }
    }

    public boolean isAlive(){
        if(health > 0){
            return true;
        }else{
            return false;
        }
    }

    public abstract int attack();

}

