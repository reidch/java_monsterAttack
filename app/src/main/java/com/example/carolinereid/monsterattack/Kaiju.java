package com.example.carolinereid.monsterattack;

import com.example.carolinereid.monsterattack.behaviours.Attackable;
import com.example.carolinereid.monsterattack.behaviours.Moveable;

/**
 * Created by carolinereid on 25/10/2017.
 */

public abstract class Kaiju {

    private String name;
    protected int healthValue;
    private int attackValue;
    private Attackable attack;
    private Moveable move;

    public Kaiju(String name, int healthValue, int attackValue) {
        this.name = name;
        this.healthValue = healthValue;
        this.attackValue = attackValue;
    }

    public String getName() {
        return this.name;
    }

    public int getHealthValue() {
        return this.healthValue;
    }

    public int getAttackValue() {
        return this.attackValue;
    }

    public String roar(){
        return "RAAAAAAAHHHHH";
    }

    public String attack() {
        return this.attack.attack();
    }

    public void takeHit(int hit){
        this.healthValue -= hit;
    }

    public void attackWithSword(){
        this.healthValue -= 200;
    }

    public void attackWithTank(){
        this.healthValue -= 100;
    }
}
