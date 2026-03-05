package com.billing.payment;

public class BankTransferPayment implements PaymentMethod  {

    @Override
    public String getPaymentType() {
        // TODO Auto-generated method stub
        return "BANK_TRANSFER";
    }

    @Override
    public boolean pay(double amount) {
        // TODO Auto-generated method stub
        return true;
    }
    
   
}
