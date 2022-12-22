package com.company;

public interface Observable {
    void notifyUsers();
    void login(Listener listener);
    void logout(Listener listener);
}
