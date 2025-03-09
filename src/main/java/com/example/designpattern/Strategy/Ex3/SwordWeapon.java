package com.example.designpattern.Strategy.Ex3;

/**
 * 전략 패턴 알고리즘 (전략무기)
 */
public class SwordWeapon implements WeaponStrategy {
    private final String swordWeapon;

    public SwordWeapon(String weaponType) {
        this.swordWeapon = weaponType;
    }

    @Override
    public void attack() {
        System.out.println(swordWeapon + " Attack");
    }
}
