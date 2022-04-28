package com.programming.gfg.recursion;

/**
 * I/P => 4 , O/P => (4+3+2+1+0) = 10
 * @author Tanmoy Mukherjee
 */
public class SumofNaturalNumbers {

    public static void main(String[] args) {
        System.out.println("sum(4,0) = " + sum(4, 0));
    }

    private static int sum(int number , int sum){
        if(number == 0){
            return sum;
        }
        return sum(number-1,sum+number);
    }
}
