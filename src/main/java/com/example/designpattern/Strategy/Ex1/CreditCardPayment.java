package com.example.designpattern.Strategy.Ex1;

/**
 * 전략패턴의 알고리즘 (전략도구)
 */
public class CreditCardPayment implements PaymentStrategy {
    private String name;
    private String cardNumber;

    public CreditCardPayment(String name, String cardNumber) {
        this.name = name;
        this.cardNumber = cardNumber;
    }


    //인터페이스 구현부
    @Override
    public void pay(int amount) {
        System.out.println(amount + " paid with credit card");
    }
}
