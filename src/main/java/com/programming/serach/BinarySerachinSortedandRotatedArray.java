package com.programming.serach;

/**
 * I/P -> {10,9,2,4,6,7,8,}
 * Key -> 2
 * @author Tanmoy Mukherjee
 */
public class BinarySerachinSortedandRotatedArray {
    public static void main(String[] args) {
        int [] input = {10,9,2,4,6,7,8,};
        int key = 2;
        System.out.println("sortedAndRotatedArray(input,key) = " + sortedAndRotatedArray(input, key));
    }
    private static int sortedAndRotatedArray(int [] arr , int key){
       int left =0;
       int right =arr.length-1;
       int middle =0;
       while(left<=right){
           middle = left+right/2;
           System.out.println("middle = " + middle);
           if(arr[middle] == key){
               return middle;
           }
           if(arr[left] <= arr[middle] ){
               System.out.println("First iteration........");
                  if(key >= arr[left] && key < arr[middle]){
                      right = middle-1;
                      System.out.println("right = " + right);
                  }
                  else{
                      System.out.println("Middle in else............"+middle);
                      left = middle+1;
                      System.out.println("left = " + left);
                  }
           }
           else{
               if(key > arr[middle] && key <= arr[right]){
                   left = middle+1;
               }
               else{
                   right = middle-1;
               }
           }
       }
       return -1;
    }
}
