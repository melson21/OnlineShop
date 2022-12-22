package com.company;

public class payByJusan implements Payment{
    @Override
    public String pay(String code, String password, double cost, double r) {
        return cost + " has been debited from your Jusan card, " + r + " remains";
    }
}
