package com.programming.array;

import java.util.Arrays;

/**
 * @author Tanmoy Mukherjee
 */
public class SelectionSort {
    public static void main(String[] args) {
        int [] input = {2,5,1,8,0,9,4};
        selectionSort(input);
    }

    private static void selectionSort(int [] arr){
        for(int i=0;i<arr.length-1;i++){
            int min=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[min]){
                    min =j;
                    System.out.println("min = " + min);
                }
                int temp = arr[min];
                arr[min]=arr[i];
                arr[i] = temp;

            }

            }

         System.out.println("Arrays.toString(arr) = " + Arrays.toString(arr));
    }
}
