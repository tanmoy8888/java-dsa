package com.programming.recursion;

/**
 * Need to check whether an array is Strickly sorted or not
 * Ex - {1,2,4,3,5} - NO
 *    - {1,2,3,4,4} - NO
 *    - {1,2,3,4,5} - YES
 *    Strictly sorted means it should be sorted in increasing order (++1)
 * @author Tanmoy Mukherjee
 */
public class ArraySortedCheck {
    public static  boolean sorted =false;
    public static void main(String[] args) {
        int [] arr = {1,0};
        System.out.println("This array is sorted and increasing order :: "+checkArray(arr, 0));
    }
    private  static boolean checkArray(int [] arr , int index) {
        if ((arr.length-1) == index) {
            sorted = true;
            return sorted;
        }
        if (arr[index] <arr[index+1]) {
            return checkArray(arr,index+1);
        }
        else{
            return false;
        }
    }
}
