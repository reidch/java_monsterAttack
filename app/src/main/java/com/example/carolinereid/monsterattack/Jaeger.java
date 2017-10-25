package com.example.carolinereid.monsterattack;

import com.example.carolinereid.monsterattack.behaviours.Attackable;

/**
 * Created by carolinereid on 25/10/2017.
 */

public class Jaeger extends Vehicle implements Attackable {
    public Jaeger(String name, Integer healthValue) {
        super(name, healthValue);
    }

    public String attackWithSword(){
        return "slash to the jugular!";
    }
    public String attackWithGun(){
        return "duh duh duh duh!";
    }
}
