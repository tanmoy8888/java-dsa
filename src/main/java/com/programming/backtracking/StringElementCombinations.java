package com.programming.backtracking;

/**
 * @author Tanmoy Mukherjee
 */
public class StringElementCombinations {
    public static void main(String[] args) {
        String input = "ABC";
        combination(input,"",0);
    }

    private static void combination(String input , String combination , int index){
        if(input.length() == 0){
            System.out.println("inside base condition....");
            return;
        }
            for(int i =0;i<=input.length();i++) {
                System.out.println("i = " + i);
                char currentchar = input.charAt(i);
                String newString = input.substring(0,i)+input.substring(i);
               /* System.out.println("newString ==-------------------------- " + newString);
                String str2 = input.substring(i);
                System.out.println("str2 = " + str2);*/
               // combination = combination + currentchar;
                System.out.println("newString = " + newString);
               // combination(newString, combination + currentchar,index+1);
        }

    }
}
