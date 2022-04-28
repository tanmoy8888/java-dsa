package com.programming.gfg.recursion;

/**
 * I/P -> "ABC" ,  O/P -> [A,B,C,AB,BC,CA,ABC]
 * @author Tanmoy Mukherjee
 */
public class PrintAllSubSetsofAString {
    public static void main(String[] args) {
        String input = "ABC";
        printAllSubSets(input,0,"");

    }
    private static void printAllSubSets(String str,int index,String current){
        if(index == str.length()){
            System.out.println(current);
            return;
        }
        printAllSubSets(str,index+1,current);
        printAllSubSets(str, index+1,current+str.charAt(index));
    }
}
