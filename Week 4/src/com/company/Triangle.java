package com.company;

public class Triangle extends Shape{
    double base, height;

    public Triangle(String name) {
        super(name);
        do{
            System.out.print("Base: ");
            this.base = Main.input.nextDouble();
            Main.input.nextLine();
        }while(this.base < 1);
        do{
            System.out.print("Height: ");
            this.height = Main.input.nextDouble();
            Main.input.nextLine();
        }while(this.height < 1);
    }

    public double getBase() {
        return base;
    }

    public double getHeight() {
        return height;
    }

    @Override
    protected void showAttribute(){
        System.out.println("Current Shape");
        System.out.println("=============");
        System.out.println("Shape: Triangle");
        System.out.println("Attribute:");
        System.out.println("- Base: " + getBase());
        System.out.println("- Height: " + getHeight());
    }

    @Override
    protected void getArea() {
        System.out.println("Your Triangle\'s area is: " + (this.base * this.height * 0.5));
    }

    @Override
    protected void getCircumference() {
        System.out.println("Your Triangle\'s circumference is: " + (this.base + (this.height*2)));
    }
}
