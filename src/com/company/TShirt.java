package com.company;

public class TShirt implements Operator{
    @Override
    public String getBrand() {
        return "T-Shirt";
    }

    @Override
    public double getCost() {
        return 7000;
    }
}
