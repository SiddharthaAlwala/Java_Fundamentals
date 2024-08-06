package com.practice.java.fundamentals;

public class ConditionalStatements {
    /*
    Customer Membership - Diamond - 20
    Gold - 15
    Silver - 10
    Others - 5
     */

    public static void main(String[] args) {
        int productPrice;
        productPrice = 77899;
        int discount;
        char memberShip;
        memberShip = 'S';
        int discountPercentage;
        if(memberShip == 'D'){
            discountPercentage = 20;
        } else if (memberShip =='G'){
            discountPercentage = 15;
        } else if (memberShip == 'S'){
            discountPercentage = 10;
        } else {
            discountPercentage = 5;
        }
        discount = (productPrice * discountPercentage) / 100;
        System.out.println("discount: " + discount);
        System.out.println("Final price: "+ (productPrice - discount));

    }


}
