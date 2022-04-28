package com.programming.gfg.array;

import java.util.Arrays;

/**
 * I/P => [index - 1 , element 4 ] , Array [2,1,5,7,0]
 * O/P => [2, 4, 1, 5, 7, 0]
 * @author Tanmoy Mukherjee
 */
public class InsertElementinArray {
    public static void main(String[] args) {
        int [] input ={2,1,5,7,0};
        insertIntoArray(input,1,4);
    }
    private  static  void insertIntoArray(int [] arr,int index , int element ){
        System.out.println(arr.length);
        if(arr.length >0){
            int [] narr = new int[arr.length+1];
            for (int i=0;i<narr.length-1;i++) {
                if(i<index){
                    narr[i] = arr[i];
                }
                else if(i == index){
                    narr[index] = element;
                }
                else {
                    narr[i] = arr[i-1];
                }
            }
            System.out.println(Arrays.toString(narr));
        }
    }
}
