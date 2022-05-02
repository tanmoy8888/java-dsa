package com.programming.gfg.array;

import java.util.Arrays;

/**
 * I/P => {1,5,7,9,2,4} , element => 9
 * O/P => {1,5,7,2,4}
 * @author Tanmoy Mukherjee
 */
public class DeleteAnyElementFromArray {
    public static void main(String[] args) {
        int [] input = {1,5,7,9,2,4};
        int element = 9;
        deleteElementFromArray(input,element);
    }
    private static void deleteElementFromArray(int [] arr , int element){
        if(arr.length > 0){
            int i =0;
            for (i = 0; i < arr.length-1; i++) {
                if(arr[i] ==  element){
                    break;
                }
            }
            int [] arrj = new int[arr.length-1];
            for(int k =0; k<i ; k++){
               arrj[k] = arr[k];
            }
            for (int j = i; j < arr.length-1 ; j++) {
                arrj[j] = arr[j+1];
                System.out.println("arrj[j] = " + arrj[j]);
            }
            System.out.println("Arrays.toString(arr) = " + Arrays.toString(arrj));
        }
    }
}
