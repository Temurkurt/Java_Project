package com.example.inheritance;

public class Entity {
    private String Name;

    public Infantry(String Name){
    this.Name = Name;
    }


    // Variables
    private int health = 20;

    protected int attackDamage = 3;
    protected int movedPlaces = 3;
    protected int defendStrength = 3;

    //Methods

    public void GiveDamage (Infantry Target){
        Target.TakeDamage(this.attackDamage);
    }
    public void TakeDamage (int takenDamage){
        health -= takenDamage - defendStrength;
    }
    public int getAttackDamage() {
        return attackDamage;
    }

    public void setAttackDamage(int attackDamage) {
        this.attackDamage = attackDamage;
    }

    public int getDefendDamage() {
        return defendStrength;
    }

    public void setDefendDamage(int defendDamage) {
        this.defendStrength = defendDamage;
    }

    public int getMovingPlaces() {
        return movedPlaces;
    }

    public void setMovingPlaces(int movingPlaces) {
        this.movedPlaces = movingPlaces;
    }



    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }
}
    class Archer extends Infantry{
        public int archersExtDmg = 2;

        public Archer(String Name) {
        super(Name);
    }



    void attackInf() {
        int attack = super.setAttackDamage(attackDamage+archersExtDmg);
        super.attackInf(attack);
    }
}
