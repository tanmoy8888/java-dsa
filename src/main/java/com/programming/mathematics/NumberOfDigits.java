package com.programming.mathematics;

/**
 * @author Tanmoy Mukherjee
 */
public class NumberOfDigits {

    public static void main(String[] args) {
        int input = 44;
        System.out.println("countNumbers(4444) = " + countNumbers(input));
    }

    private static int countNumbers(int number){
        int count = 0;
        while (number >0){
            number = number/10;
            count++;
        }
        return count;
    }
}
