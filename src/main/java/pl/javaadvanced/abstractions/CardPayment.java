package pl.javaadvanced.abstractions;

import java.math.BigDecimal;

public class CardPayment extends Payment {

    private String cardVendor;

    public CardPayment(String paymentName, String cardVendor) {
        super(paymentName);
        this.cardVendor = cardVendor;
    }

    @Override
    public String makePay(String receiver, BigDecimal amount) {
        return "Card payment " + amount + " for " + receiver;
    }

    @Override
    public String confirmPayment() {
        return super.confirmPayment() + " by Card!";
    }

    public String getCardVendor() {
        return cardVendor;
    }
}
