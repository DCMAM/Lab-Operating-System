package com.company;

public class CheeseCake extends Order{

//    public CheeseCake(String name, String size, String quantity, int price) {
//        super(name, size, quantity, price);
//    }

    // ctrl + shift s -> contructor
    public CheeseCake(String name, int rating, int price, int quantity) {
        super(name, rating, price, quantity);
    }
}
