package com.programming.gfg.recursion;

/**
 * @author Tanmoy Mukherjee
 */
public class SumofNaturalNumbers2 {
    public static void main(String[] args) {
        int input = 4;
        System.out.println("sum() = " + sum(4));
    }
    private static int sum(int number){
        if(number == 0){
            return  0;
        }
        return number+sum(number-1);
    }
}
