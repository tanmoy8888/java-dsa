package com.programming.gfg.recursion;

/**
 * I/P -- > 5 , O/P --> 5,4,3,2,1
 *
 * @author Tanmoy Mukherjee
 */
public class PrintAllNumbers {
    public static void main(String[] args) {
        printNumbers(5);
    }
    private static void printNumbers(int number){
        if(number == 0){
            return;
        }
        System.out.println(number);
        printNumbers(number-1);
    }
}
