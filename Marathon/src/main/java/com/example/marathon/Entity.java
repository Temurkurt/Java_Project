package com.example.marathon;

public class Entity {
    // Variables
    private String firstName;
    private String nameOfFamily;
    private String Class;

    private int health = 20;
    private int armor;
    private int speed;
    private int intelligence;
    private int stealth;

    protected int attackDamage;
    protected int movedPlaces = 3;
    protected int defendStrength;
    protected int moverCounter;
    protected int physicalDamage;
    protected int magicalDamage;

    public Entity(String firstName, String nameOfFamily, String aClass, int attackDamage) {
    }


    //Methods

    public void GiveDamage (Entity Target){

        if(physicalDamage < magicalDamage ) {
            attackDamage = magicalDamage;
        }else if(physicalDamage > magicalDamage) {
            attackDamage = physicalDamage;
        }

        Target.TakeDamage(this.attackDamage);
    }

    public void TakeDamage (int takenDamage) {
        health -= takenDamage - defendStrength;
    }

    public void setDefendStrength(int defendStrength){
        this.defendStrength = 3 + armor/10;
    }

    public int getDefendStrength(){
        return defendStrength;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void setMovedPlaces(){
        movedPlaces += speed/10;
        movedPlaces -= moverCounter;
    }

    public int getArmor() {
        return armor;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public int getStealth() {
        return stealth;
    }

    public void setStealth(int stealth) {
        this.stealth = stealth;
    }
}
