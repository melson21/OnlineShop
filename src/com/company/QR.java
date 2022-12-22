package com.company;

public class QR extends Decorator{
    public QR(Operator operator) {
        super(operator);
    }

    public String getBrand(){
        return operator.getBrand() + " by QR";
    }
    public double getCost(){
        return operator.getCost() + 5000;
    }
}
