package com.programming.recursion;

/**
 * Q - Find the power of x^n , Ex 2^5 = 32
 *
 * @author Tanmoy Mukherjee
 */
public class PowerOfElement {
    public static void main(String[] args) {
        System.out.println(findPower(2, 5));
    }

    private static int findPower(int element , int power){
        if(power == 0){
            return 1;
        }
        if(power%2==0){
           return  findPower(element,power/2) * findPower(element,power/2);
        }
        else{
           return  findPower(element,power/2) * findPower(element,power/2) * element;
        }
    }
}
