package com.example.carolinereid.monsterattack;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by carolinereid on 25/10/2017.
 */

public class TankTest {

    Tank tank;
    Otachi otachi;
    Leatherback leatherback;

    @Before
    public void before() {
        otachi = new Otachi("Colin", 1000, 25);
        leatherback = new Leatherback("Glenda", 2000, 50);
        tank = new Tank("Crusher MKZ", 600);
    }

    @Test
    public void hasName() {
        assertEquals("Crusher MKZ", tank.getName());
    }

    @Test
    public void checkHealthValue() {
        assertEquals(600, tank.getHealthValue());
    }

    @Test
    public void canBeAttackedByOtachi(){
        assertEquals(otachi.attack(), "lash with tongue");
    }

    @Test
    public void canBeAttackedByLeatherback(){
        assertEquals(leatherback.attack(), "trample underfoot");
    }

    @Test
    public void canBeAttackedWithTongue(){
        tank.takeHit(100);
        assertEquals(500, tank.getHealthValue());
    }
}
