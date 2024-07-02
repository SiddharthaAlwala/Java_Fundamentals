package com.practice.java.codingquestions;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a num: ");
        int num = sc.nextInt();
        int sum = 0;
        while(num != 0){
            int digit = num % 10;
            sum += num % 10;
            num/=10;
        }
        System.out.println("Sum of digits: "+ sum);
    }
}
