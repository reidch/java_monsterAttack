package com.example.carolinereid.monsterattack;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by carolinereid on 25/10/2017.
 */

public class JaegerTest {

    Jaeger jaeger;
    Otachi otachi;
    Leatherback leatherback;

    @Before
    public void before() {
        otachi = new Otachi("Colin", 1000, 25);
        leatherback = new Leatherback("Glenda", 2000, 50);
        jaeger = new Jaeger("Brawler Yukon", 800);
    }

    @Test
    public void hasName() {
        assertEquals("Brawler Yukon", jaeger.getName());
    }

    @Test
    public void checkHealthValue() {
        assertEquals(800, jaeger.getHealthValue());
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
    public void canBeAttackedWithFeet(){
        jaeger.takeHit(200);
        assertEquals(600, jaeger.getHealthValue());
    }
}
