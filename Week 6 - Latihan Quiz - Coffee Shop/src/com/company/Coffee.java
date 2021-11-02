package com.company;

public class Coffee extends Order{
    String type, size;

    // ctrl + shift + s -> constructor
    public Coffee(String name, int rating, int price, int quantity, String type, String size) {
        super(name, rating, price, quantity);
        this.type = type;
        this.rating = rating;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }
}
