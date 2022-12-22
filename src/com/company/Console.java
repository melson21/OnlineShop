package com.company;

import java.util.Scanner;

public class Console {
    Scanner scanner = new Scanner(System.in);
    private int n,ord;
    private int ch;
    private boolean bl = true;
    public void basic(String username, Cart cart1) {
        System.out.println(username + " what do you want to buy:");
        while(bl){
            System.out.println("1 - add clothes \n2 - remove clothes \n3 - show Cart");
            ch = scanner.nextInt();
            if(ch ==1){
                Adder(cart1);
            }
            if(ch == 3){
                bl = false;
            }
            if(ch == 2){
                System.out.println("which item would you like to remove?");
                n = scanner.nextInt();
                cart1.removeClothes(n,ord);
            }
        }
    }
    public void Adder(Cart cart1){
        boolean b = true;
        while(b){
            System.out.println("1 - Jeans \n2 - Sweatshirt \n3 - T-shirt \n4 - Jacket \n5 - Stop adding");
            n = scanner.nextInt();
            if(n==5){
                break;
            }
            System.out.println("Choose brand: \n" +
                    "1 - ZARA \n2 - QR \n3 - Nike \n4 - Armani");
            ord = scanner.nextInt();
            cart1.addClothes(n, ord);
        }
    }
}
