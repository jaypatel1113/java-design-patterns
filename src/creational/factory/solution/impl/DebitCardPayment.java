package creational.factory.solution.impl;

import creational.factory.solution.contract.Payment;

public class DebitCardPayment implements Payment {
    @Override
    public void pay(int amount) {
        System.out.println("Processed payment using debit card : " + amount);
    }
}
