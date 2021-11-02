package com.company;

import java.util.Scanner;

public class Main {
    Scanner input = new Scanner(System.in);

    public Main(){
        int menu=0;
        do{
            cls();
            print_menu();
            menu = input.nextInt(); input.nextLine();

            if(menu >= 1 && menu <= 4) menu2(menu);
            if(menu == 0) break;
        }while(true);
    }

    void get_message(int index, String name, int quantity){
        System.out.printf("Confirmation\n");
        System.out.printf("============\n");
        System.out.printf("Dear %s, please check your game detail below\n", name);

        System.out.printf("Game Name: %s\n", getGameName(index));
        System.out.printf("Game Genre: %s\n", getGameGenre(index));
        System.out.printf("Game Price: %d\n", getGamePrice(index));
        System.out.printf("Quantity: %d\n", quantity);
        System.out.printf("Total Price: %d\n", (quantity * getGamePrice(index)));

        String choice;
        do{
            System.out.print("Are you sure your product is right? [Yes|No]: ");
            choice = input.nextLine();
            if(choice.equals("Yes") || choice.equals("No")) break;
        }while(true);
    }

    String getGameName(int index){
        if(index == 1) return "Resident Evil VII:Biohazard";
        else if(index == 2) return "Counter Strike: Global Offensive";
        else if(index == 3) return "3. Dynasty Warriors 8";
        else if(index == 4) return "4. Tekken 7";
        else if(index == 5) return "5. Final Fantasy XV";
        return null;
    }

    int getGamePrice(int index){
        if(index == 1) return 50000;
        else if(index == 2) return 40000;
        else if(index == 3) return 25000;
        else if(index == 4) return 10000;
        else if(index == 5) return 1000000;
        return 0;
    }

    String getGameGenre(int index){
        if(index == 1) return "Horror";
        else if(index == 2) return "FPS";
        else if(index == 3) return "Action";
        else if(index == 4) return "Action";
        else if(index == 5) return "RPG";
        return null;
    }

    void menu2(int index){
        int quantity=0;
        String name;

        do{
            System.out.print("Input game quantity [1 - 10 | Numeric]: ");
            quantity = input.nextInt(); input.nextLine();
        }while(quantity < 1 || quantity > 10);
        do{
            System.out.print("Input yout name [5 - 20 characters]: ");
            name = input.nextLine();
        }while(name.length() < 5 || name.length() > 20);

        get_message(index, name, quantity);
    }

    void print_menu(){
        System.out.printf("GA.me\n");
        System.out.printf("=====\n");
        System.out.printf("1. Resident Evil VII:Biohazard\n");
        System.out.printf("2. Counter Strike: Global Offensive\n");
        System.out.printf("3. Dynasty Warriors 8\n");
        System.out.printf("4. Tekken 7\n");
        System.out.printf("5. Final Fantasy XV\n");
        System.out.printf("Choose game you want to buy [1..5 | 0 to Exit]: ");
    }

    void cls(){
        for (int i=0; i<56; i++)
            System.out.println();
    }

    public static void main(String[] args) {
	    new Main();
    }
}
