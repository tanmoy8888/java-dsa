package com.programming.recursion;

/**
 * @author Tanmoy Mukherjee
 */
public class SumOfNNumbers {

    public static void main(String[] args) {
        int result = printSum(1,5,0);
        System.out.println("Final sum of the numbers is :: " + result);
                
    }
    private static int printSum(int i , int n , int sum){
        if (i ==n){
            sum =sum+i;
            return sum;
        }
        sum = sum+i;
        System.out.println("sum = " + sum);
        return printSum(i+1,n,sum);
    }
}
