package com.programming.gfg.array;

/**
 * I/P => {4,2,7,8,10,1}
 * O/P => 3
 * @author Tanmoy Mukherjee
 */
public class FindSecondLargestIndexofArray {
    public static void main(String[] args) {
        int [] input = {4,2,7,8,10,1};
        System.out.println("findSecondIndex(input) = " + findSecondIndex(input));
    }
    private static int findSecondIndex(int [] arr){
        int maxIndex =0;
        int max = arr[0];
        int hightestIndex = findMaxIndex(arr);
        for (int i = 1; i < arr.length; i++) {
            if (i != hightestIndex) {
                if (max > arr[i]) {
                    max = max;
                    maxIndex = maxIndex;
                } else {
                    max = arr[i];
                    maxIndex = i;
                }
            }
        }
        System.out.println("Second max = "+max);
        System.out.println("Second maxIndex = "+maxIndex);
        return maxIndex;
    }
    private static int findMaxIndex(int [] arr){
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
