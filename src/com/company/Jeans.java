package com.company;

public class Jeans implements Operator{
    @Override
    public String getBrand() {
        return "Jeans";
    }

    @Override
    public double getCost() {
        return 12000;
    }
}
