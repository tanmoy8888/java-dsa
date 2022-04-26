package com.programming.gfg.recursion;

/**
 * @author Tanmoy Mukherjee
 */
public class BaseCondition {
    public static void main(String[] args) {
        printName(5);
    }
    private static void printName(int number){
        if(number == 0){
            return;
        }
        System.out.println("Tanmoy Mukherjee");
        printName(number-1);
    }
}
