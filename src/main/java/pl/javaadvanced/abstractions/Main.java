package pl.javaadvanced.abstractions;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        //nie można utworzyć obiektu na klasie abstrakcyjnej
        //Payment defaultPayment = new Payment();
        String result;
        String confirmMessage;

        Payment payment1 = new BlikPayment();
        result = payment1.makePay("Jan Kowalski", new BigDecimal(100));
        confirmMessage = payment1.confirmPayment();
        System.out.println(result);
        System.out.println(confirmMessage);

        System.out.println("=+=+=+=+=+=+=+=+=+=+=+=");

        Payment payment2 = new CardPayment("Credit Card trasfer", "Visa");
        result = payment2.makePay("Jan Nowak", new BigDecimal(10));
        confirmMessage = payment2.confirmPayment();
        System.out.println(result);
        System.out.println(confirmMessage);
        System.out.println(payment2.getPaymentName());
    }
}
