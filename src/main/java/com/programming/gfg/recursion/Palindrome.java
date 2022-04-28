package com.programming.gfg.recursion;

/**
 * @author Tanmoy Mukherjee
 */
public class Palindrome {
    public static void main(String[] args) {
        String input = "ABCDEDCBA";
        System.out.println("palindrome(input) = " + palindrome(input,0,input.length()-1));

    }
    private static boolean palindrome(String input , int first , int last){
        if(last <= first){
            return true;
        }
        if(input.charAt(first) == input.charAt(last)){
            return palindrome(input , first+1,last-1);
        }
        else{
            return false;
        }
    }
}
