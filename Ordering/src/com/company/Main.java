package com.company;

import java.util.Optional;

public class Main {

    public static void main(String[] args) {
	    ShoppingCart shoppingCart = new ShoppingCart();
        Product brush = Catalogue.getProduct("Brush & paste");
        Product soap = Catalogue.getProduct("Lux");
        shoppingCart.addProduct(new LineItem(brush,1));
        shoppingCart.addProduct(new LineItem(soap,2));
        System.out.println(shoppingCart.getTotalCost());

        Customer akshay = new Customer("akshay", 5459648900469991L);
        Optional<Order> order = akshay.checkOut(shoppingCart);
        System.out.println(order);
    }
}
