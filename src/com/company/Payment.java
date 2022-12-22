package com.company;

public interface Payment {
    public String pay(String code, String password, double cost, double remains);
}
