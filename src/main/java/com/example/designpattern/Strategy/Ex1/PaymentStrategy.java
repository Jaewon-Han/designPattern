package com.example.designpattern.Strategy.Ex1;

/**
 * 모든 전략 구현제에 대한 공용 인터페이스
 */
public interface PaymentStrategy {
    void pay(int amount);
}
