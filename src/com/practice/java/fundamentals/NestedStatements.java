package com.practice.java.fundamentals;

public class NestedStatements {
    public static void main(String[] args) {
        outer:for (int i = 1;i<=3;i++){
           inner: for (int j =1;j<=3;j++){
                if(i == j)
                   break inner;
                    //continue;
                System.out.println(i + " " + j);
            }
        }
    }
}
