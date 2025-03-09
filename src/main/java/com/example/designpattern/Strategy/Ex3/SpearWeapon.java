package com.example.designpattern.Strategy.Ex3;

/**
 * 전략 패턴 알고리즘 (전략무기)
 */
public class SpearWeapon implements WeaponStrategy {

    private final String spearWeaponType;

    public SpearWeapon(String weaponType) {
        this.spearWeaponType = weaponType;
    }

    @Override
    public void attack() {
        System.out.println(spearWeaponType + " Attack");
    }
}
