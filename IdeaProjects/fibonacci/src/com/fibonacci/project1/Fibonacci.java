package com.fibonacci.project1;


public class Fibonacci {

    public static void main(String[] args) {

        // declaring integers
        int totalCount = 12;

        int number1 = 0;

        int number2 = 1;


        for (int i = 1; i <= totalCount; i++) { // using "for" method...


                System.out.print(number1 + " "); //printing the result....

                int sum = number1 + number2;

                number1 = number2;

                number2 = sum;





        }
    }
}
