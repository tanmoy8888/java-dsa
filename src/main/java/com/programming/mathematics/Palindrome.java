package com.programming.mathematics;

/**
 * @author Tanmoy Mukherjee
 */
public class Palindrome {
    public static void main(String[] args) {
        int input = 123;
        System.out.println("input is palindrome " + (input==getReverseNumber(input)));
    }
    private static int getReverseNumber(int input){
        int lastdigit = 0;
        int reverse = 0;
        while(input > 0){
            lastdigit = input%10;
            reverse = reverse*10+lastdigit;
            input = input/10;
        }
        return reverse;
    }
}
