package com.programming.gfg.recursion;

/**
 * @author Tanmoy Mukherjee
 */
public class GuessOP1 {
    public static void main(String[] args) {
        printName(3);
    }
    private static void printName(int number){
        if(number == 0){
            return;
        }
        printName(number-1);
        System.out.println(number);
        printName(number-1);
    }
}
