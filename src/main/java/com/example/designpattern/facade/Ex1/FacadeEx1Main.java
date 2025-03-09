package com.example.designpattern.facade.Ex1;

/**
 * 실행 클라이언트
 */
public class FacadeEx1Main {
    public static void main(String[] args) {
        Thermostat thermostat = new Thermostat();
        Lights lights = new Lights();
        CoffeeMaker coffeeMaker = new CoffeeMaker();

        SmartHomeFacade smartHome
                = new SmartHomeFacade(
                    thermostat
                   ,lights
                   ,coffeeMaker
        );      

        smartHome.wakeUp();
        smartHome.leaveHome();

    }
}
