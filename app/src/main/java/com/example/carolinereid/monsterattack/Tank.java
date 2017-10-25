package com.example.carolinereid.monsterattack;

import com.example.carolinereid.monsterattack.behaviours.Attackable;

/**
 * Created by carolinereid on 25/10/2017.
 */

public class Tank extends Vehicle implements Attackable {
    public Tank(String name, Integer healthValue) {
        super(name, healthValue);
    }

    public String attackWithTracks(){
        return "splat!";
    }

    public String attackWithRocket(){
        return "boom!";
    }

}
