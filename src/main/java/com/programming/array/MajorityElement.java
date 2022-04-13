package com.programming.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Tanmoy Mukherjee
 */
public class MajorityElement {
    public static void main(String[] args) {
        int [] arr = {1,4,2,6,2,1,2,7};
    }
    private List<Integer> getMajorityElements(int [] arr){
        List<Integer> list = new ArrayList<>();
        if(arr.length >0){
            int count =0;
            int second =0;
            Arrays.sort(arr);
            int MAX = arr[0];
            int SECOND_MAX = 0;
            for(int i =0;i<arr.length;i++){
                if (arr[i] == MAX){
                    count=count+1;
                    MAX = arr[i];
                }
                else{
                    SECOND_MAX = arr[i];
                    second =second+1;
                }
            }
        }
        return list;
    }
}
