package com.programming.recursion;

/**
 * @author Tanmoy Mukherjee
 */
public class BasicIncreasingOrderRecursion {
    public static void main(String[] args) {
        numbers(1,6);
    }
    private static void numbers(int n, int limit){
        if(n==limit){
            return;
        }
        System.out.println("n = " + n);
        numbers(n+1,limit);
    }
}
