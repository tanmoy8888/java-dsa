package com.programming.recursion;

/**
 * Fibonacci -> 0,1,1,2,3,5,8,11
 * @author Tanmoy Mukherjee
 */
public class Fibonacci {
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        System.out.println(a);
        System.out.println(b);
        int n =8;
        fibo(a,b,n-2);
    }
    private static void fibo(int a , int b , int n){
      if(n ==0){
          return;
      }
      int c =a+b;
      System.out.println(c);
      fibo(b,c,n-1);
    }



}
