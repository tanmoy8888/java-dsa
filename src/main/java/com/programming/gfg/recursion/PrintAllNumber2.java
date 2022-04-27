package com.programming.gfg.recursion;

/**
 * I/P --> 5 , O/P --> 1,2,3,4,5
 * @author Tanmoy Mukherjee
 */
public class PrintAllNumber2 {
    public static void main(String[] args) {
        printAllNumbers(5,1);
    }
    private static void printAllNumbers(int number , int base){
        if(base == number){
            System.out.println(number);
            return;
        }
        System.out.println(base);
        printAllNumbers(number,base+1);

    }
}
