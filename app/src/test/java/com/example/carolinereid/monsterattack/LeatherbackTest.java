package com.example.carolinereid.monsterattack;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by carolinereid on 25/10/2017.
 */

public class LeatherbackTest {

    Leatherback leatherback;
    Tank tank;
    Jaeger jaeger;

    @Before
    public void before() {
        tank = new Tank("Crusher MKZ", 600);
        jaeger = new Jaeger("Brawler Yukon", 800);
        leatherback = new Leatherback("Glenda", 2000, 50);
    }

    @Test
    public void hasName() {
        assertEquals("Glenda", leatherback.getName());
    }

    @Test
    public void checkHealthValue() {
        assertEquals(2000, leatherback.getHealthValue());
    }

    @Test
    public void checkAttackValue() {
        assertEquals(50, leatherback.getAttackValue());
    }

    @Test
    public void canRoar() {
        assertEquals("RAAAAAAAHHHHH", leatherback.roar());
    }

    @Test
    public void canMove(){
        assertEquals(leatherback.move(), "stomp, stomp");
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
    public void canBeAttackedWithSword(){
        leatherback.takeHit(200);
        assertEquals(1800, leatherback.getHealthValue());
    }
}