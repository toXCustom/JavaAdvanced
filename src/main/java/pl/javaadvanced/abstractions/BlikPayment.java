package pl.javaadvanced.abstractions;

import java.math.BigDecimal;

public class BlikPayment extends Payment {
    public BlikPayment() {
        super(); //wywołanie konstruktora z klasy po której dziedziczymy
    }

    @Override
    public String makePay(String receiver, BigDecimal amount) {
        return "Receiver " + receiver + " got " + amount + " of money from us!";
    }
}
