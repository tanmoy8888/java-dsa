package com.programming.recursion;

/**
 * I/P ->  TANMOY  , O/P -> YOMNAT
 * @author Tanmoy Mukherjee
 */
public class StringReverse {

    public static void main(String[] args) {
        String s = "TANMOY";
        reverseString(s,s.length()-1);
    }
    private static void reverseString(String str , int index){
        if(index ==0){
            System.out.print(str.charAt(index));
            return;
        }
        System.out.print(str.charAt(index));
        reverseString(str,index-1);
    }
}
