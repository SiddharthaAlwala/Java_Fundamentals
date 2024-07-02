package com.practice.java;

public class Switch {
    public static void main(String[] args) {
        String brand = "Samsung";
        int productPrice;
        productPrice = 77899;
        int discount;
        int discountPercentage;
        discountPercentage = 1;
        char memberShip ;
        memberShip = 'D';
        switch (brand){
            case "Samsung":
                if(memberShip == 'D')
                    discountPercentage = 30;
                else if (memberShip == 'G')
                    discountPercentage = 20;
                break;
            case "apple":
                if(memberShip == 'D')
                    discountPercentage = 25;
                else if (memberShip == 'G')
                    discountPercentage = 15;
                break;
            default:
                discountPercentage = 5;
        }
        discount = (productPrice * discountPercentage) / 100;
        System.out.println("discount: " + discount);
        System.out.println("Final price: "+ (productPrice - discount));

    }
}
