package com.programming.recursion;

/**
 * I/P -> "aabcdde"
 * O/P -> "abcde"
 * @author Tanmoy Mukherjee
 */
public class RemoveDuplicates {

    public static void main(String[] args) {
        String str="aabcdde";
        removeDuplicates(str,"",0,0);

    }
    private static void removeDuplicates(String original, String unique,int index, int count){
        if(index == original.length()){
            System.out.println("unique = " + unique);
            return;
        }
        if(index < original.length()){
            if(index == 0) {
                unique = unique + String.valueOf(original.charAt(index));
                count = count +1;
            }
            else{
                if(unique.indexOf(original.charAt(index)) == -1){
                     unique = unique+String.valueOf(original.charAt(index));
                }
            }
            removeDuplicates(original,unique,index+1,count);
        }
    }
}
