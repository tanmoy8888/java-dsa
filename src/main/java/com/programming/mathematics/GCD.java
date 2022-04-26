package com.programming.mathematics;

/**
 * @author Tanmoy Mukherjee
 */
public class GCD {
    public static void main(String[] args) {
          int a = 4;
          int b = 16;
        System.out.println("findGCD(a,b) = " + findGCD(a, b));
    }

    private static int findGCD(int a , int b){
        int min = Math.min(a,b);
        while (min > 0){
            if(a%min == 0 &&  b%min == 0){
                break;
            }
            min--;
        }
        return  min;
    }
}
