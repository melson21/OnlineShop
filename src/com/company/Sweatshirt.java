package com.company;

public class Sweatshirt implements Operator{
    @Override
    public String getBrand() {
        return "Sweatshirt";
    }

    @Override
    public double getCost() {
        return 18000;
    }
}
