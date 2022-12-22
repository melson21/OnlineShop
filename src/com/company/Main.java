package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name:");
        String username = scanner.nextLine();
        System.out.println("Hello, " + username);
        Console user = new Console();
        System.out.println("Enter your Kaspi card number, password and available money");
        String kaspinumb = scanner.next();
        String kaspipassw = scanner.next();
        double kaspimoney = scanner.nextInt();
        System.out.println("Enter your Jusan card number, password and available money");
        String jusannumb = scanner.next();
        String jusanpassw = scanner.next();
        double jusanmoney = scanner.nextInt();
        System.out.println("Enter your Halyk Bank card number, password and available money");
        String halyknumb = scanner.next();
        String halykpassw = scanner.next();
        double halykmoney = scanner.nextInt();

        Cart cart = Cart.getInstance();
        Listener first_user = new User(username);
        user.basic(username, cart);
        cart.login(first_user);
        cart.notifyUsers();
        System.out.println("\nType of delivery: \n1 - Foot courier: 2000.0 \n2 - Taxi courier: 5000.0");
        int courier = scanner.nextInt();

        double cost = cart.getCost();
        if(courier == 1){
            FootCourier fc = new FootCourier();
            cost += fc.getFootCourierCost();
        }
        if(courier == 2){
            TaxiCourier tc = new TaxiCourier();
            cost += tc.getTaxiCourierCost();
        }
        System.out.println("\nTotal cost is " + cost);

        System.out.println("Pay by: \n1 - Kaspi "+ kaspimoney + " available\n2 - Jusan " + jusanmoney + " available\n3 - Halyk Bank " + halykmoney + " available\n");
        int cardnumb = scanner.nextInt();

        if(cardnumb == 1){
            Check kaspi = new Check(new KaspiChecker());
            System.out.println(kaspi.checkcash(kaspinumb, kaspipassw, kaspimoney, courier));
        }
        if(cardnumb == 2){
            Check jusan = new Check(new JusanChecker());
            System.out.println(jusan.checkcash(jusannumb, jusanpassw, jusanmoney, courier));
        }
        if(cardnumb == 3){
            Check halyk = new Check(new HalykChecker());
            System.out.println(halyk.checkcash(halyknumb, halykpassw, halykmoney, courier));
        }
    }
}
