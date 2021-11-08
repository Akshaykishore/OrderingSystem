package com.company;

import java.util.UUID;

public class Payment {
    private final Card card;
    private final int value;
    private final UUID id;
    public Payment(Card card, int value, UUID id) {
        this.card = card;
        this.value = value;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Payment{" +
                "card=" + card +
                ", value=" + value +
                ", id=" + id +
                '}';
    }
}
