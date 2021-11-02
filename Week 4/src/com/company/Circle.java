package com.company;

public class Circle extends Shape{
    double diameter;

    public Circle(String name) {
        super(name);
        do{
            System.out.print("Diameter: ");
            this.diameter = Main.input.nextDouble();
            Main.input.nextLine();
        }while(this.diameter < 1);
    }

    public double getDiameter() {
        return diameter;
    }

    @Override
    protected void showAttribute(){
        System.out.println("Current Shape");
        System.out.println("=============");
        System.out.println("Shape: Circle");
        System.out.println("Attribute:");
        System.out.println("- Diameter: " + getDiameter());
    }

    @Override
    protected void getArea() {
        System.out.println("Your Circle\'s area is: " + (Math.PI * Math.pow(this.diameter/2, 2)));
    }

    @Override
    protected void getCircumference() {
        System.out.println("Your Circle\'s circumference is: " + (Math.PI * this.diameter));
    }
}
