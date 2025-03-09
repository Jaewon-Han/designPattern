package com.example.designpattern.facade.Ex1;

/**
 * Facade 역할의 클래스 (하나의 창구)
 * 이 클래스를 통해 서비스를 이용함
 */
public class SmartHomeFacade {
    private final Thermostat thermostat;
    private final Lights lights;
    private final CoffeeMaker coffeeMaker;

    public SmartHomeFacade(
     Thermostat thermostat
    , Lights lights
    , CoffeeMaker coffeeMaker) {
        this.thermostat = thermostat;
        this.lights = lights;
        this.coffeeMaker = coffeeMaker;
    }

    public void wakeUp() {
        System.out.println("wake up");
        thermostat.setTemperature(22);
        lights.on();
        coffeeMaker.brewCoffee();
    }

    public void leaveHome() {
        System.out.println("leave home");
        thermostat.setTemperature(18);
        lights.off();
    }
}
