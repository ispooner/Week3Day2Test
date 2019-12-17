package com.company;

public class FizzBuzz {

    public void fizzbuzz(int num) {
        if(num % 3 == 0) {
            System.out.print("fizz");
        }
        if(num % 5 == 0) {
            System.out.print("buzz");
        }
        System.out.println();
    }

}
