package com.practice.java.fundamentals;

public class Loops {
    public static void main(String[] args) {
        // code to print all even numbers within a given range
        // constraints (least, max) 100000
        int number ;
        int maxLimit;
        maxLimit = 100;
        /*number = 1;
        while(number <= maxLimit){
            if(number % 2 == 0)
                System.out.println(number);
            number++;
        }*/

        /*
        Main difference between for loop and while is memory allocation as for loop initializes i value in the loop it will release the memory after implimenting the for loop.
        Whereas, in while loop initalized number value still use the memory after implimenting the while loop.
         */
        // for loop
        for(int i= 1;i<= maxLimit;i++){
            if(i%2==0)
                System.out.println(i);

        }

        // do while will be used when we impliment menu driven applications.
        /*
        example :
            Welcome to amazon.
            Choose category:
                * Men
                * Women
                * Kids
         */
        number = 1;
        do{
            System.out.println(number);
            number ++;
        } while (number >= 5);

    }
}
