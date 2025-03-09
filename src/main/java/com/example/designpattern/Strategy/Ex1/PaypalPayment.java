package com.example.designpattern.Strategy.Ex1;

/**
 * 전략패턴의 알고리즘 (전략도구)
 */
public class PaypalPayment implements PaymentStrategy {
    private String email;

    public PaypalPayment (String email) {
        this.email = email;
    }

    @Override
    public void pay(int amount) {
        System.out.println(amount + " paid using PayPal");
    }
}
