package com.company;

public class payByKaspi implements Payment{
    @Override
    public String pay(String code, String password, double cost, double remains) {
        return cost + " has been debited from your Kaspi card, " + remains + " remains";
    }
}
