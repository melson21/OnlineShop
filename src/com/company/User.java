package com.company;

import java.util.List;

public class User implements Listener {
    private String username;

    public User(String username){
        this.username = username;
    }
    @Override
    public void fullList(List<String> clothes) {
        System.out.println(username + " added this clothes to Cart:" + "\n " + clothes);
    }
}
