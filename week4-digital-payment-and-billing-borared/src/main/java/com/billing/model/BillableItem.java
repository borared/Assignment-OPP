package com.billing.model;

public abstract class BillableItem {
    private String name;
    private double basePrice;

    public BillableItem(String name, double basePrice){
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Name cannot be null or blank");
        }
        setBasePrice(basePrice);
    }

    public String getName(){
        return name;
    }

    public double getBasePrice(){
        return basePrice;
    }

    public void setBasePrice(double basePrice){
        if(basePrice > 0){
            this.basePrice = basePrice;
        }else{
            throw new IllegalArgumentException("Price must be greater than 0.");
        }
    }

    public abstract double calculatePrice();

    public String getDescription() {
        return name + " - $" + calculatePrice();
    }
}
