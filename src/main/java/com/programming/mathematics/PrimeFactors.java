package com.programming.mathematics;

/**
 * @author Tanmoy Mukherjee
 */
public class PrimeFactors {
    public static void main(String[] args) {
     int input = 16;
     getPrimeFactors(input);
    }
     private static void getPrimeFactors(int input){
         for (int i = 2; i < input; i++) {
                if(isPrime(i)){
                    int x =i;
                    while (input%x == 0){
                        System.out.println(i);
                         x = x*i;
                    }
                }
         }
     }
     private static boolean isPrime(int input){
        if (input == 1) return false;
        if (input == 2 || input == 3) return true;
        if (input % 2 == 0 || input % 3 == 0) {
            return false;
        }
        else {
            return true;
        }
     }

}
