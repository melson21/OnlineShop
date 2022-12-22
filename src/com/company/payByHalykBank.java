package com.company;

public class payByHalykBank implements Payment{
    @Override
    public String pay(String code, String password, double cost, double r) {
        return cost + " has been debited from your Halyk Bank card, " + r + " remains";
    }
}
