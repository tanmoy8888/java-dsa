package com.programming.mathematics;

/**
 * @author Tanmoy Mukherjee
 */
public class DivisorsOfNumbers {
    public static void main(String[] args) {
        int input = 15;
        allDivisors(input);
    }
    private static void allDivisors(int input){
        if(input > 0){
            for(int i =1;i<=input ; i++){
                if(input % i ==0){
                    System.out.println(i);
                }
            }
        }
    }
}
