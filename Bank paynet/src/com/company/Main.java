package com.company;

import java.util.Scanner;

import static java.lang.System.in;

public class Main {

    public static void main(String[] args) {
        // write your code here


        Scanner scanner = new Scanner(in);
        String[] boneName = new String[100];
        String[] boneCArt = new String[100];
        int boneCount = 0;
        System.out.println(" Bone ");
        System.out.println(" User name write");
        scanner = new Scanner(in);
        String nameUser = scanner.nextLine();
        System.out.println("Cart number write ");
        String cart = scanner.nextLine();
        while (true) {
            System.out.println("Add cart > 1");
            System.out.println("Phone Payment > 2");
            System.out.println("Card Payment  > 3");
            System.out.println("Communal Payment > 4");
            System.out.println("CashBack card > 5");
            System.out.println(" card > 6");
            System.out.println("=");
            int n = scanner.nextInt();


            switch (n) {
                case 1 -> {
                    scanner = new Scanner(in);
                    System.out.println(" add card");
                    System.out.println(" user write");
                    String userName = scanner.nextLine();
                    System.out.println(" card number write");
                    int cardNumber = scanner.nextInt();
                    if (nameUser.length() >= 4 && cart.length() >= 4) {

                        System.out.println("success");
                    } else {
                        System.out.println("cart number or name number less");
                        System.out.println();

                    }

                }
                case 2 -> {
                    scanner = new Scanner(in);
                    System.out.println(" phone payment");
                    System.out.println(" phone number write");

                    System.out.print("+998");
                    int phoneNumber = scanner.nextInt();
                    if (nameUser.length() == 9 && cart.length() > 10000) {

                        System.out.println("money or phone number Less ");
                    } else {
                        System.out.println("success");
                        System.out.println();

                    }


                }
                case 3 -> {
                    scanner = new Scanner(in);
                    System.out.println(" card payment");
                    System.out.println(" card number write");

                    System.out.print("8600");
                    int phoneNumber = scanner.nextInt();
                    if (nameUser.length() > 1 && cart.length() > 10000) {
                        System.out.println("success");

                    } else {
                        System.out.println("money or card number Less ");


                    }


                }


                case 4 -> {
                    scanner = new Scanner(in);
                    System.out.println("communal payment");
                    System.out.println(" card number write");


                    System.out.print("8600");
                    int phoneNumber = scanner.nextInt();
                    if (nameUser.length() > 1 && cart.length() > 10000) {
                        System.out.println("success");

                    } else {
                        System.out.println("money or card number Less ");


                    }
                }

                case 5 -> {
                    scanner = new Scanner(in);
                    System.out.println("cashback ");
                    System.out.println(" card number write");

                    System.out.print("8600");
                    int phoneNumber = scanner.nextInt();
                    if (nameUser.length() > 1 && cart.length() > 10000) {
                        System.out.println("success");

                    } else {
                        System.out.println("money or card number Less ");

                    }

                }

                case 6 -> {
                    scanner = new Scanner(in);
                    System.out.println("card payment card ");
                    System.out.println(" card number write");

                    System.out.print("8600");
                    int phoneNumber = scanner.nextInt();
                    if (nameUser.length() > 1 && cart.length() > 10000) {
                        System.out.println("success");

                    } else {
                        System.out.println("money or card number Less ");


                    }
                }
            }
        }
    }
}



