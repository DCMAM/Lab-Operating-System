package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    Scanner input = new Scanner(System.in);

    ArrayList<Order> orderList = new ArrayList<Order>();

    public Main(){
        String menu;
        do{
            System.out.print("Choose menu you want to order [Coffee | Cheese Cake | exit]:");
            menu = input.nextLine();
            if(menu.equals("exit")) break;
            if(menu.equals("Coffee")){
                System.out.println("Order Coffee:");

                String name, size, type;
                int rating, quantity;
                do{
                    System.out.print("Input order name [5..20 char]: ");
                    name = input.nextLine();
                }while(name.length() < 5 || name.length() > 20);
                do{
                    System.out.print("Input order size [Small | Medium | Large]: ");
                    size = input.nextLine();
                }while(!size.equals("Small") && !size.equals("Medium") && !size.equals("Large"));
                do{
                    System.out.print("Input order type [Cold | Hot]: ");
                    type = input.nextLine();
                }while(!type.equals("Cold") && !type.equals("Hot"));
                do{
                    System.out.print("input order rating [1..4]: ");
                    rating = input.nextInt(); input.nextLine();
                }while(rating < 1 || rating > 4);
                do{
                    System.out.print("input order quantity: ");
                    quantity = input.nextInt(); input.nextLine();
                }while(quantity < 1);


                int base_price = rating * 10000;
                int size_price = getSizeInt(size) * 5000;
                // ( Base Price +  Size Price ) * Quantity
                int price = (base_price + size_price) * quantity;

                orderList.add(new Coffee(name, rating, price, quantity, type, size));

                showCoffee();
            }
            else if(menu.equals("Cheese Cake")){
                String name, size, type;
                int rating, quantity;
                do{
                    System.out.print("Input order name [5..20 char]: ");
                    name = input.nextLine();
                }while(name.length() < 5 || name.length() > 20);
                do{
                    System.out.print("input order rating [1..4]: ");
                    rating = input.nextInt(); input.nextLine();
                }while(rating < 1 || rating > 4);
                do{
                    System.out.print("input order quantity: ");
                    quantity = input.nextInt(); input.nextLine();
                }while(quantity < 1);

                int base_price = rating * 10000;
                // ( Base Price +  Size Price ) * Quantity
                int price = base_price * quantity;
                orderList.add(new CheeseCake(name, rating, price, quantity));

                showCheeseCake();
            }
        }while(true);

    }

    void showCoffee(){
        for (int i=0; i<orderList.size(); i++){
            if(orderList.get(i) instanceof Coffee){
                System.out.println("Name: " + orderList.get(i).getName() +
                        ", Rating: " + orderList.get(i).getRating() +
                        ", Quantity: " + orderList.get(i).getQuantity() +
                        ", Price: " + orderList.get(i).getPrice() +
                        ", Type: " + ((Coffee) orderList.get(i)).getType() +
                        ", Size: " + ((Coffee) orderList.get(i)).getSize()
                );
            }
        }
    }

    void showCheeseCake(){
        for (int i=0; i<orderList.size(); i++){
            if(orderList.get(i) instanceof CheeseCake){
                System.out.println("Name: " + orderList.get(i).getName() +
                        ", Rating: " + orderList.get(i).getRating() +
                        ", Quantity: " + orderList.get(i).getQuantity() +
                        ", Price: " + orderList.get(i).getPrice()
                );
            }
        }
    }

    int getSizeInt(String size){
        if(size.equals("Small")) return 1;
        else if(size.equals("Medium")) return 2;
        if(size.equals("Large")) return 3;
        return 0;
    }

    public static void main(String[] args) {
	    new Main();
    }
}
