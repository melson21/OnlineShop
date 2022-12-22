package com.company;

public class Jacket implements Operator{
    @Override
    public String getBrand() {
        return "Jacket";
    }

    @Override
    public double getCost() {
        return 20000;
    }
}
