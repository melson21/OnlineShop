package com.company;

abstract public class Decorator implements Operator{
    public Operator operator;
    public Decorator(Operator operator) {
        this.operator = operator;
    }
    public String getBrand(){
        return operator.getBrand();
    }
    public double getCost(){
        return operator.getCost();
    }
}
