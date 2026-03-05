package com.billing.payment;

public class CreditCardPayment implements PaymentMethod {

    private String cardNumber;

    public CreditCardPayment(String cardNumber) {
        setCardNumber(cardNumber);
    }

    public String getCardNumber(){
         return cardNumber;
    }
    public void setCardNumber(String cardNumber){
        if (cardNumber == null || cardNumber.isEmpty()) {
            throw new IllegalArgumentException("Card number cannot be null or blank");
        }
        this.cardNumber = cardNumber;
    }

    @Override
    public boolean pay(double amount) {
        if (amount > 5000) {
            return false;
        }
        return true;
    }

    @Override
    public String getPaymentType() {
        return "CREDIT_CARD";
    }
}