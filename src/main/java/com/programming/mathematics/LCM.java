package com.programming.mathematics;

/**
 * @author Tanmoy Mukherjee
 */
public class LCM {
    public static void main(String[] args) {
        int a = 10;
        int b = 15;
        System.out.println("findLCM(a,b) = " + findLCM(a, b));
    }
    private static int findLCM(int a , int b){
        int max = Math.max(a,b);
        while (true){
            if(max%a == 0 && max%b == 0){
                return max;
            }
            else{
                max++;
            }
        }
    }

}
