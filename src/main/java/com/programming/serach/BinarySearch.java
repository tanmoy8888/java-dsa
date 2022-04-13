package com.programming.serach;

/** -- Binary Serach implementation using iteration
 * @author Tanmoy Mukherjee
 */
public class BinarySearch {
    public static void main(String[] args) {
        int [] input ={2,4,6,7,8,9,10};
        int key = 10;
        System.out.println("binarySearch(input,key) = " + binarySearch(input, key));
    }
    public static int binarySearch(int [] arr , int key){
        int left = 0;
        int right = arr.length-1;
        int middle = 0;
        while(left <=right){
            middle = (left+right) / 2;
            if(arr[middle] == key){
                return  middle;
            }
            if(arr[middle] < key){
                left = middle+1;
            }
            else{
                right = middle-1;
            }
        }
        return  -1;
    }
}
