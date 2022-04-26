package com.programming.mathematics;

/**
 * @author Tanmoy Mukherjee
 */
public class Factorial {
    public static void main(String[] args) {
        int input = 4;
        System.out.println("factorial(input) = " + factorial(input));
    }
    private static int factorial(int input){
        int fact = 1;
        if(input > 0){
            for(int i=2;i<=input;i++){
                fact = fact *i;
            }
        }
        return fact;
    }
}
