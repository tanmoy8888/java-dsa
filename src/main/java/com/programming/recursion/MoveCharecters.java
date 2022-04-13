package com.programming.recursion;

/**
 * I/P -> axbxcxdx , O/P -> abcdxxxx
 * @author Tanmoy Mukherjee
 */
public class MoveCharecters {
    public static void main(String[] args) {
        String s ="ABCXDEXFGH";
        char element ='X';
        move(s,element,0,0,"");
    }
    private static void move(String str , char element , int index, int count , String newStr) {
        if (str.length() == index) {
            for (int i = 0; i < count; i++) {
                newStr = newStr + element;
            }
            System.out.println(newStr);
        }
        if (index < str.length()) {
            if (str.charAt(index) == element) {
                count = count + 1;
            } else {
                newStr = newStr + str.charAt(index);
            }
            move(str, element, index + 1, count, newStr);
        }
    }
}
