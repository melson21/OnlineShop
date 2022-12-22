package com.company;

import java.util.ArrayList;
import java.util.List;

public class Cart implements Observable{
    private List<Listener> users = new ArrayList<>();

    private List<String> clothes = new ArrayList<>();

    private static Cart instance = null;

    double cost = 0.0;

    TShirt tshirt = new TShirt();
    Sweatshirt sweatshirt = new Sweatshirt();
    Jeans jeans = new Jeans();
    Jacket jacket = new Jacket();

    public static Cart getInstance(){
        if(instance == null){
            instance = new Cart();
        }
        return instance;
    }

    public void addClothes(int numb, int ord) {
        if(numb == 1){
            if(ord==1){
                Operator item = new ZARA(new Jeans());
                this.cost += (item.getCost());
                this.clothes.add(item.getBrand());
            }
            else if(ord==2){
                Operator item = new QR(new Jeans());
                this.cost += (item.getCost());
                this.clothes.add(item.getBrand());
            }
            else if(ord==3){
                Operator item = new Nike(new Jeans());
                this.cost += (item.getCost());
                this.clothes.add(item.getBrand());
            }
            else if(ord==4){
                Operator item = new Armani(new Jeans());
                this.cost += (item.getCost());
                this.clothes.add(item.getBrand());
            }
        }
        else if(numb == 2){
            if(ord==1){
                Operator item = new ZARA(new Sweatshirt());
                this.cost += (item.getCost());
                this.clothes.add(item.getBrand());
            }
            else if(ord==2){
                Operator item = new QR(new Sweatshirt());
                this.cost += (item.getCost());
                this.clothes.add(item.getBrand());
            }
            else if(ord==3){
                Operator item = new Nike(new Sweatshirt());
                this.cost += (item.getCost());
                this.clothes.add(item.getBrand());
            }
            else if(ord==4){
                Operator item = new Armani(new Sweatshirt());
                this.cost += (item.getCost());
                this.clothes.add(item.getBrand());
            }
        }
        else if(numb == 3){
            if(ord==1){
                Operator item = new ZARA(new TShirt());
                this.cost += (item.getCost());
                this.clothes.add(item.getBrand());
            }
            else if(ord==2){
                Operator item = new QR(new TShirt());
                this.cost += (item.getCost());
                this.clothes.add(item.getBrand());
            }
            else if(ord==3){
                Operator item = new Nike(new TShirt());
                this.cost += (item.getCost());
                this.clothes.add(item.getBrand());
            }
            else if(ord==4){
                Operator item = new Armani(new TShirt());
                this.cost += (item.getCost());
                this.clothes.add(item.getBrand());
            }
        }
        else if(numb == 4){
            if(ord==1){
                Operator item = new ZARA(new Jacket());
                this.cost += (item.getCost());
                this.clothes.add(item.getBrand());
            }
            else if(ord==2){
                Operator item = new QR(new Jacket());
                this.cost += (item.getCost());
                this.clothes.add(item.getBrand());
            }
            else if(ord==3){
                Operator item = new Nike(new Jacket());
                this.cost += (item.getCost());
                this.clothes.add(item.getBrand());
            }
            else if(ord==4){
                Operator item = new Armani(new Jacket());
                this.cost += (item.getCost());
                this.clothes.add(item.getBrand());
            }
        }
        notifyUsers();
    }

    public void removeClothes(int numb, int ord){
        if(numb == 1){
            if(ord==1){
                Operator item = new ZARA(new Jeans());
                this.cost += (item.getCost());
                this.clothes.remove(item.getBrand());
            }
            else if(ord==2){
                Operator item = new QR(new Jeans());
                this.cost += (item.getCost());
                this.clothes.remove(item.getBrand());
            }
            else if(ord==3){
                Operator item = new Nike(new Jeans());
                this.cost += (item.getCost());
                this.clothes.remove(item.getBrand());
            }
            else if(ord==4){
                Operator item = new Armani(new Jeans());
                this.cost += (item.getCost());
                this.clothes.remove(item.getBrand());
            }
        }
        else if(numb == 2){
            if(ord==1){
                Operator item = new ZARA(new Sweatshirt());
                this.cost += (item.getCost());
                this.clothes.remove(item.getBrand());
            }
            else if(ord==2){
                Operator item = new QR(new Sweatshirt());
                this.cost += (item.getCost());
                this.clothes.remove(item.getBrand());
            }
            else if(ord==3){
                Operator item = new Nike(new Sweatshirt());
                this.cost += (item.getCost());
                this.clothes.remove(item.getBrand());
            }
            else if(ord==4){
                Operator item = new Armani(new Sweatshirt());
                this.cost += (item.getCost());
                this.clothes.remove(item.getBrand());
            }
        }
        else if(numb == 3){
            if(ord==1){
                Operator item = new ZARA(new TShirt());
                this.cost += (item.getCost());
                this.clothes.remove(item.getBrand());
            }
            else if(ord==2){
                Operator item = new QR(new TShirt());
                this.cost += (item.getCost());
                this.clothes.remove(item.getBrand());
            }
            else if(ord==3){
                Operator item = new Nike(new TShirt());
                this.cost += (item.getCost());
                this.clothes.remove(item.getBrand());
            }
            else if(ord==4){
                Operator item = new Armani(new TShirt());
                this.cost += (item.getCost());
                this.clothes.remove(item.getBrand());
            }
        }
        else if(numb == 4){
            if(ord==1){
                Operator item = new ZARA(new Jacket());
                this.cost += (item.getCost());
                this.clothes.remove(item.getBrand());
            }
            else if(ord==2){
                Operator item = new QR(new Jacket());
                this.cost += (item.getCost());
                this.clothes.remove(item.getBrand());
            }
            else if(ord==3){
                Operator item = new Nike(new Jacket());
                this.cost += (item.getCost());
                this.clothes.remove(item.getBrand());
            }
            else if(ord==4){
                Operator item = new Armani(new Jacket());
                this.cost += (item.getCost());
                this.clothes.remove(item.getBrand());
            }
        }
        notifyUsers();
    }

    public double getCost(){
        return cost;
    }

    @Override
    public void notifyUsers() {
        for(Listener listener: users){
            listener.fullList(this.clothes );
        }
    }
    @Override
    public void login(Listener listener) {
        this.users.add(listener);
    }

    @Override
    public void logout(Listener listener) {
        this.users.remove(listener);
    }

}