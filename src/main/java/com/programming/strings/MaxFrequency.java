package com.programming.strings;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @author Tanmoy Mukherjee
 */
public class MaxFrequency {
    public static void main(String[] args) {
        String input="Hi this is sentence which is use to give input to this program";
        System.out.println(findMaxfrequencyOfWords(input));
    }

    private static List<String> findMaxfrequencyOfWords(String input){
        String [] arr = input.split(" ");
        List<String>  list = null;
        if(arr.length > 0){
            Map<String,Integer> map = new HashMap<String,Integer>();
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
            int MAX_VALUE = Collections.max(map.values());
            list = map.entrySet().stream()
                    .filter(e->e.getValue() == MAX_VALUE)
                    .map(e->e.getKey())
                    .collect(Collectors.toList());
        }
        return list;
    }

}
