package com.company;

public class ZARA extends Decorator{
    public ZARA(Operator operator) {
        super(operator);
    }
    public String getBrand(){
        return operator.getBrand() + " by ZARA";
    }
    public double getCost() {
        return operator.getCost() + 8000;
    }
}
