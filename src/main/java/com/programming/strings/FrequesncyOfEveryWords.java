package com.programming.strings;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Tanmoy Mukherjee
 */
public class FrequesncyOfEveryWords {
    public static void main(String[] args) {
       String input="Hi this is sentence which is use to give input to this program";
        System.out.println("findfrequencyOfWords(input) = " + findfrequencyOfWords(input));
    }
    private static Map<String,Integer> findfrequencyOfWords(String input){
        String [] arr = input.split(" ");
        Map<String,Integer> map = new HashMap<String,Integer>();
        if(arr.length > 0){
            for(int i =0;i<arr.length;i++){
                if(i==0){
                    map.put(arr[i],1);
                }
                else{
                    if(map.containsKey(arr[i])){
                        int value = map.get(arr[i]);
                        map.replace(arr[i],value+1);
                    }
                    else {
                        map.put(arr[i],1);
                    }
                }
            }
        }
        return map;
    }


}
