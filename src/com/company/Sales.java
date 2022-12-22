package com.company;

public class Sales {
    private Payment payment;

    public Sales(Payment payment){
        this.payment = payment;
    }

    public String pay(String s, String p, double c, double r){
        return payment.pay(s, p, c, r);
    }
}
