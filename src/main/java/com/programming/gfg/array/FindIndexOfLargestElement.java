package com.programming.gfg.array;

/**
 * I/P => {4,2,7,8,10,1}
 * O/P => 10
 * @author Tanmoy Mukherjee
 */
public class FindIndexOfLargestElement {
    public static void main(String[] args) {
        int [] input = {4,2,7,8,10,1};
        System.out.println("findIndex(arr) = " + findIndex(input));
    }
    private static int findIndex(int [] arr){
        int maxIndex =0;
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(max > arr[i]){
                max = max;
                maxIndex = maxIndex;
            }
            else{
                max = arr[i];
                maxIndex= i;
            }
        }
        System.out.println("max = "+max);
        System.out.println("maxIndex = "+maxIndex);
        return maxIndex;
    }
}
