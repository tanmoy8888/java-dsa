package com.programming.mathematics;

/**
 * @author Tanmoy Mukherjee
 */
public class TrailingZero {
    public static void main(String[] args) {
        int input = 10;
        int factorial = factorial(input);
        System.out.println("factorial = " + factorial);
        int count = countTrailingZero(factorial);
        System.out.println("count = " + count);
    }

    private static int factorial(int input){
        int fact =1;
        for(int i=2;i <=input;i++){
            fact = fact*i;
        }
        return fact;
    }
    
    private  static  int countTrailingZero(int factorial){
        int count =0;
        int lastdigit  = 0 ;
        while(factorial >0 && lastdigit == 0){
            lastdigit = factorial%10;
            if(lastdigit == 0){
                count++;
                factorial = factorial/10;
            }
        }
        return  count;
    }
}
