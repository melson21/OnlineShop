package com.company;

public class Check {
    private CardChecker cardChecker;

    public Check(CardChecker cardChecker){
        this.cardChecker = cardChecker;
    }
    public String checkcash(String numb, String passw, double money, int courier){
        return cardChecker.checkcash(numb, passw, money, courier);
    }
}
