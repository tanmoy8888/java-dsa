package com.programming.gfg.recursion;

/**
 * I/P => 123 , O/P => (1+2+3) = 6
 * @author Tanmoy Mukherjee
 */
public class SumOfDigitsOfaNumber {
    public static void main(String[] args) {
        int input = 123;
        System.out.println("sumOfDigits(input) = " + sumOfDigits(input));

    }
    private static int sumOfDigits(int number ){
        if(number == 0){
            return  0;
        }
        return sumOfDigits(number/10)+number%10;
    }

}
