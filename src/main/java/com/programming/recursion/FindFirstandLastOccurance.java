package com.programming.recursion;

/**
 * Find first and last index of the  occurrence  of a character element in a given string
 * @author Tanmoy Mukherjee
 */
public class FindFirstandLastOccurance {
    public static int first=-1;
    public static int last=-1;
    public static void main(String[] args) {
        String str = "eabeaea";
        findOccurrence('a',str,str.length()-1);
    }
    private static void findOccurrence(char element,String str, int index){
        if(index ==0){
            {
                if (str.charAt(0) == element) {
                    System.out.println("First Occurrence index :: " + 0);
                }
                else {
                    System.out.println("First Occurrence index :: " + first);
                }
                System.out.println("Last Occurrence index :: " + last);
            }
            return;
        }
        Character c = str.charAt(index);
        if(c==element){
          if(last == -1){
              last = index;
          }
          else{
              first = index;
          }
        }
        findOccurrence(element , str, index-1);
    }
}
