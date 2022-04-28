package com.programming.gfg.recursion;

/**
 * I/P => {AB} , OP => [AB, BA]
 * @author Tanmoy Mukherjee
 */
public class PermutationOfString {
    public static void main(String[] args) {
        String input = "ABC";
        permutation(input,0);
    }
    private static void permutation(String input , int index){
        if(index == input.length()){
            System.out.println(input);
        }
        for (int i = index; i < input.length(); i++) {
            input =swap(input,index,i);
            permutation(input,index+1);
            input=swap(input,index,i);
        }
    }
    private static String swap(String str , int i , int j){
        char [] chars = str.toCharArray();
        char temp = chars[i];
        chars[i] = chars[j];
        chars[j] = temp;
        return String.valueOf(chars);
    }
}
