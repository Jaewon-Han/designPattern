package com.example.designpattern.Strategy.Ex1;

import lombok.Setter;

/**
 * 알고리즘(전략) 실행해야 할 때마다 해당
   알고리즘과 연결된 전략 객체의 메소드를 호출하는 클래스
 *
 */
@Setter
public class ShoppingCart {
    private PaymentStrategy paymentStrategy;

    public void checkout(int amount) {
        paymentStrategy.pay(amount);
    }
}
