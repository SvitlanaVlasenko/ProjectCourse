package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        for (int i = 0; i < 101; i++) {
            if (i % 3 == 0) {
            System.out.println("Hello");
            if (i % 5 == 0)
            System.out.println("Word");
        }else if (i % 3 == 0 && i % 5 == 0) {
            System.out.println("HelloWorld");
        } else {
                System.out.println(i);
            }
        }
    }

}
