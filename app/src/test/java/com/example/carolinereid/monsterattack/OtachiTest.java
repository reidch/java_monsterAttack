package com.example.carolinereid.monsterattack;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by carolinereid on 25/10/2017.
 */

public class OtachiTest {

    Otachi otachi;
    Tank tank;
    Jaeger jaeger;

    @Before
    public void before() {
        tank = new Tank("Crusher MKZ", 600);
        jaeger = new Jaeger("Brawler Yukon", 800);
        otachi = new Otachi("Colin", 1000, 25);
    }

    @Test
    public void hasName() {
        assertEquals("Colin", otachi.getName());
    }

    @Test
    public void checkHealthValue() {
        assertEquals(1000, otachi.getHealthValue());
    }

    @Test
    public void checkAttackValue() {
        assertEquals(25, otachi.getAttackValue());
    }

    @Test
    public void canRoar() {
        assertEquals("RAAAAAAAHHHHH", otachi.roar());
    }

    @Test
    public void canMove(){
        assertEquals(otachi.move(), "slither, slither");
    }

    @Test
    public void canBeFlattenedByTank(){
        assertEquals(tank.attackWithTracks(), "splat!");
    }

    @Test
    public void canBeBlastedByTank(){
        assertEquals(tank.attackWithRocket(), "boom!");
    }

    @Test
    public void canBeSlashedByJaeger(){
        assertEquals(jaeger.attackWithSword(), "slash to the jugular!");
    }

    @Test
    public void canBeShotByJaeger(){
        assertEquals(jaeger.attackWithGun(), "duh duh duh duh!");
    }

    @Test
    public void canBeFlattened(){
        otachi.takeHit(100);
        assertEquals(900, otachi.getHealthValue());
    }
}
