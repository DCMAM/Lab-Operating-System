package com.company;

import java.util.Scanner;

public class Main {
    Scanner input = new Scanner(System.in);

    public Main() {
        String directory, file;
        do {
            System.out.print("Input file directory: ");
            directory = input.nextLine();
        } while (directory.isEmpty());
        do {
            System.out.print("Input file name to be delete: ");
            file = input.nextLine();
        } while (file.isEmpty());
    }

    public static void main(String[] args) {
        new Main();
    }
}
