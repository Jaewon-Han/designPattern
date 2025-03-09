package com.example.designpattern.Strategy.Ex1;

/**
 * client code
 */
public class StrategyEx1Main {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        cart.setPaymentStrategy(
                new CreditCardPayment(
                        "Jaewon Han"
                             ,"94123412"
                )
        );

        cart.checkout(1000);

        cart.setPaymentStrategy(
                new PaypalPayment(
                        "point1054@naver.com"
                )
        );

        cart.checkout(10000);
    }
}
