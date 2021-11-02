package com.company;

public abstract class Shape {
    String name;

    public Shape(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    protected void showAttribute(){
        System.out.println("Attribute:");
        System.out.println("-");
    }

    protected abstract void getArea();
    protected abstract void getCircumference();
}
