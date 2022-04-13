package com.programming.array;

/**
 * I/P -> {4,2,6,1,6,7,3,2,4,8,6,5} , O/P ->(8-1) = 7
 * @author Tanmoy Mukherjee
 */
public class StockMaxProfit1 {

    public static void main(String[] args) {
        int [] input = {4,2,6,1,6,7,3,2,4,8,6,5};
        System.out.println("Maxprofit :: "+maxProfit(input));
    }

    private static int maxProfit(int [] arr){
        int maxProfit =0;
        int minimumSoFar =arr[0];
        if(arr.length >0){
            for(int i =0;i<arr.length;i++){
                minimumSoFar = Math.min(minimumSoFar,arr[i]);
                System.out.println("minimumSoFar= " + minimumSoFar);
                int profit = arr[i] -minimumSoFar;
                System.out.println("profit = " + profit);
                maxProfit = Math.max(maxProfit,profit);
                System.out.println("profit = " + profit);
            }
        }
        return maxProfit;
    }
}
