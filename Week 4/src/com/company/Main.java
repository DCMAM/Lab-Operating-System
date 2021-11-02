package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner input = new Scanner(System.in);

    ArrayList<Shape> shapeList = new ArrayList<Shape>();
    Shape shape;

    public Main(){
        String menu;
        do{
            cls();
            currentShape();
            System.out.println();
            printMenu();
            menu = input.nextLine();
            if(menu.equals("1")) menu1();
            else if(menu.equals("2")) menu2();
            else if(menu.equals("3")) menu3();
            pause();
        }while(!menu.equals("4"));
    }

    private void currentShape() {
        if(this.shape == null){
            System.out.println("Current Shape");
            System.out.println("=============");
            System.out.println("Shape: -");
            System.out.println("Attribute: -");
            System.out.println();
        } else{
            shape.showAttribute();
        }
    }

    void menu1(){
        String name;
        do{
            System.out.print("Input shape [Square | Triangle | Circle]: ");
            name = input.nextLine();
        }while(!name.equals("Square") && !name.equals("Triangle") && !name.equals("Circle"));

        if(name.equals("Square")) shape = new Square(name);
        else if(name.equals("Triangle")) shape = new Triangle(name);
        else if(name.equals("Circle")) shape = new Circle(name);
    }

    void menu2(){
        if(this.shape == null) return;
        else shape.getArea();
    }

    void menu3(){
        if(this.shape == null) return;
        else shape.getCircumference();
    }

    void printMenu(){
        System.out.println("Menu");
        System.out.println("====");
        System.out.println("1. Create Shape");
        System.out.println("2. Calculate Area");
        System.out.println("3. Calculate Circeumference");
        System.out.println("4. Exit");
        System.out.print("Choose: ");
    }

    void cls(){
        for (int i = 0; i < 50; i++) System.out.println();
    }

    void pause(){
        System.out.println("Press any key to continue..");
        input.nextLine();
    }

    public static void main(String[] args) {
        new Main();
    }
}
