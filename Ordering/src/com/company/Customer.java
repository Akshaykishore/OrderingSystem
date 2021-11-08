package com.company;

import java.util.Optional;

public class Customer {
    private final String name;
    private Card card;

    public Customer(String name, long ccnumber) {
        this.name = name;
        this.card = new Card(ccnumber);

    }

    public Optional<Order> checkOut(ShoppingCart cart){
        Optional<Payment> payment = card.mkPayment(cart.getTotalCost());
        return payment.map(p -> new Order(this,cart,p));
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", card=" + card +
                '}';
    }
}
