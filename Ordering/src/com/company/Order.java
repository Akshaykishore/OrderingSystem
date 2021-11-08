package com.company;

public class Order {
    private Customer customer;
    private ShoppingCart shoppingCart;
    private Payment payment;

    public Order(Customer customer, ShoppingCart shoppingCart, Payment payment) {
        this.customer = customer;
        this.shoppingCart = shoppingCart;
        this.payment = payment;
    }

    public ShoppingCart getCart(){
        return shoppingCart;
    }

    @Override
    public String toString() {
        return "Order{" +
                "customer=" + customer +
                ", shoppingCart=" + shoppingCart +
                ", payment=" + payment +
                '}';
    }
}
