package com.company;

public class Square extends Shape{
    double side;

    public Square(String name) {
        super(name);
        do{
            System.out.print("Side: ");
            this.side = Main.input.nextDouble();
            Main.input.nextLine();
        }while(this.side < 1);
    }

    public double getSide() {
        return side;
    }

    @Override
    protected void showAttribute(){
        System.out.println("Attribute:");
        System.out.println("- Side: " + getSide());
    }

    @Override
    protected void getArea() {
        System.out.println("Your Square\'s area is: " + (this.side * this.side));
    }

    @Override
    protected void getCircumference() {
        System.out.println("Your Square\'s circumference is: " + (this.side * 4));
    }
}
