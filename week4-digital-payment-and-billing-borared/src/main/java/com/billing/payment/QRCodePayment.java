package com.billing.payment;

public class QRCodePayment implements PaymentMethod {

    @Override
    public String getPaymentType() {
        // TODO Auto-generated method stub
        return  "QR_CODE";
    }

    @Override
     public boolean pay(double amount) {
        if (amount < 1) {
            return false;
        }
        return true;
    }
}
