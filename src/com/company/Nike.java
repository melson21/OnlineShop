package com.company;

public class Nike extends Decorator{
    public Nike(Operator operator) {
        super(operator);
    }
    public String getBrand(){
        return operator.getBrand() + " by Nike";
    }
    public double getCost() {
        return operator.getCost() + 10000;
    }
}
