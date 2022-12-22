package com.company;

public class Armani extends Decorator{
    public Armani(Operator operator) {
        super(operator);
    }
    public String getBrand(){
        return operator.getBrand() + " by Armani";
    }
    public double getCost() {
        return operator.getCost() + 20000;
    }
}
