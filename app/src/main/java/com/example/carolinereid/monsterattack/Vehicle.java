package com.example.carolinereid.monsterattack;

import com.example.carolinereid.monsterattack.behaviours.Attackable;

/**
 * Created by carolinereid on 25/10/2017.
 */

public abstract class Vehicle {

    private String name;
    private int healthValue;
    private Attackable attack;

    public Vehicle(String name, int healthValue) {
        this.name = name;
        this.healthValue = healthValue;
        this.attack = attack;
    }

    public String getName() {
        return this.name;
    }

    public int getHealthValue() {
        return this.healthValue;
    }

    public String attack() {
        return this.attack.attack();
    }

    public void takeHit(int hit){
        this.healthValue -= hit;
    }

    public void attackWithFeet(){
        this.healthValue -= 200;
    }

    public void attackWithTongue(){
        this.healthValue -= 100;
    }
}
