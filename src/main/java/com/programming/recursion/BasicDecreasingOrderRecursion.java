package com.programming.recursion;

/**
 * @author Tanmoy Mukherjee
 */
public class BasicDecreasingOrderRecursion {
    public static void main(String[] args) {
        numbers(4);
    }
    private static void numbers(int n){
        if(n == 0){
            return;
        }
        System.out.println("n = " + n);
        numbers(n-1);
    }
}
