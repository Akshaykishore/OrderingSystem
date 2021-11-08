package com.company;

import java.util.Optional;
import java.util.UUID;

public class Card {
    private final long card;

    public Card(long card) {
        this.card = card;
    }

    public Optional<Payment> mkPayment(int value){
        if(Math.random() > 0.3){
            return Optional.of(new Payment(this,value, UUID.randomUUID()));
        }else {
            return Optional.empty();
        }
    }

    @Override
    public String toString() {
        return "Card{" +
                "card=" + card +
                '}';
    }
}
