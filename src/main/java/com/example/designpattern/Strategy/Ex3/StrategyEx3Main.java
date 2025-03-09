package com.example.designpattern.Strategy.Ex3;

/**
 * client code
 */
public class StrategyEx3Main {
    public static void main(String[] args) {

        HuntingGround huntingGround = new HuntingGround();

        huntingGround.setWeaponStrategy(new SpearWeapon("spear"));

        huntingGround.hunting();

        huntingGround.setWeaponStrategy(new SwordWeapon("sword"));

        huntingGround.hunting();

    }
}
