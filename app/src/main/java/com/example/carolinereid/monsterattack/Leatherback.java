package com.example.carolinereid.monsterattack;

import com.example.carolinereid.monsterattack.behaviours.Attackable;
import com.example.carolinereid.monsterattack.behaviours.Moveable;

/**
 * Created by carolinereid on 25/10/2017.
 */

public class Leatherback extends Kaiju implements Attackable, Moveable {
    public Leatherback(String name, int healthValue, int attackValue) {
        super(name, healthValue, attackValue);
    }

    public String move(){
        return "stomp, stomp";
    }

    public String attack(){
        return "trample underfoot";
    }
}
