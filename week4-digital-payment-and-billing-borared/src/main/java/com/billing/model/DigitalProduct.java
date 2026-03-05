package com.billing.model;


public class DigitalProduct extends BillableItem {
    private double fileSizeMB;

    public DigitalProduct(String name, double basePrice, double fileSizeMB){
        super(name, basePrice);
        setFileSizeMB(fileSizeMB);
    }

    public double getFileSizeMB(){
        return fileSizeMB;
    }

    public void setFileSizeMB(double fileSizeMB){
        if(fileSizeMB > 0){
            this.fileSizeMB = fileSizeMB;
        }else{
            throw new IllegalArgumentException("`fileSizeMB` must be > 0");
        }
    }

    @Override
    public double calculatePrice() {
        // TODO Auto-generated method stub
        return getBasePrice();
    }
}
