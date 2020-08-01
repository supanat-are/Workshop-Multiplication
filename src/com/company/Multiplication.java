package com.company;

import java.util.Scanner;

public class Multiplication {

    public static void main(String[] args) {

        Scanner reder = new Scanner(System.in);
        int number;
        String input = "";

        while (!input.equals("Y")) {
            System.out.print("Please enter number of Multiplication table: ");
            number = reder.nextInt();

            System.out.println("คำนวนสูตรคูณแม่" + " " + number);
            System.out.println("###################################");
            for (int i = 0; i < 13; i++) {
                System.out.println(number + "x" + i + "=" + number * i);
            }
            System.out.println("###################################");
            System.out.print("do you want to exti program Y/N : ");
            input = reder.next();
        }

            System.out.print("Exit program");

    }

}
