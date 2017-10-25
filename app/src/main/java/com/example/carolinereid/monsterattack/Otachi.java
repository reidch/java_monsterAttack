package com.example.carolinereid.monsterattack;

import com.example.carolinereid.monsterattack.behaviours.Attackable;
import com.example.carolinereid.monsterattack.behaviours.Moveable;

/**
 * Created by carolinereid on 25/10/2017.
 */

public class Otachi extends Kaiju implements Attackable, Moveable {

    public Otachi(String name, int healthValue, int attackValue) {
        super(name, healthValue, attackValue);
    }

    public String move(){
        return "slither, slither";
    }

    public String attack(){
        return "lash with tongue";
    }
}
