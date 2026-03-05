package com.billing.model;

public class PhysicalProduct extends BillableItem{
    private double weight;

    public PhysicalProduct(String name, double basePrice, double weight) {
        super(name, basePrice);

        setWeight(weight);
    }

    public double getWeight(){
        return weight;
    }

    public void setWeight(double weight){
        if(weight > 0){
            this.weight = weight;
        }else{
            throw new IllegalArgumentException("Weight must be > 0.");
        }
    }

    @Override
    public double calculatePrice() {
        // TODO Auto-generated method stub
        double shipping = weight * 2;
        return getBasePrice() + shipping;
    }
}
