package com.practice.java.codingquestions;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();
        if(number % 2 ==0){
            System.out.println(number + " is a even number");
        }
        else{
            System.out.println(number + " is a odd number");
        }
    }
}
