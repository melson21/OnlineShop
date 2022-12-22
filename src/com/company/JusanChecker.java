package com.company;

public class JusanChecker extends CardChecker{
    @Override
    public String checkcash(String numb, String pass, double cash, int courier) {
        Cart cart = Cart.getInstance();
        double cost = cart.getCost();
        if(courier == 1){
            FootCourier fc = new FootCourier();
            cost += fc.getFootCourierCost();
        }
        if(courier == 2){
            TaxiCourier tc = new TaxiCourier();
            cost += tc.getTaxiCourierCost();
        }
        if(cost<=cash){
            double remains = cash - cost;
            Sales jusan = new Sales(new payByJusan());
            return jusan.pay(numb, pass, cost, remains);
        }
        else{
            return "Not enough money";
        }
    }
}
