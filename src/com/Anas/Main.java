package com.Anas;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello and welcome!");

        Scanner input = new Scanner(System.in);

        System.out.print("Please enter your username: ");
        String username = input.nextLine();

        System.out.print("Hii " + username);
        input.close();
    }
}


