package pl.javaadvanced.abstractions;

import java.math.BigDecimal;

//klasa abstrakcyjna
public abstract class Payment {
    String paymentName;

    public Payment() {
        paymentName = "Default payment name";
    }

    public Payment(String paymentName) {
        this.paymentName = paymentName;
    }

    public abstract String makePay(String receiver, BigDecimal amount);

    public String confirmPayment() {
        return "Payment correctly transferred";
    }

    public String getPaymentName() {
        return paymentName;
    }
}
