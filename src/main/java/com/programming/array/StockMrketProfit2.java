package com.programming.array;

/**
 * @author Tanmoy Mukherjee
 */
public class StockMrketProfit2 {
    public static void main(String[] args) {
      int [] input ={3,1,2,5,2,4};
        System.out.println("getProfit(input) = " + getProfit(input));
    }

    private static int getProfit(int [] arr){
        int profit =0;
        for(int i=0;i<arr.length;i++){
            if(i==0){
             profit=0;
            }
            else {
                if (arr[i] > arr[i - 1]) {
                    profit = profit + (arr[i] - arr[i - 1]);
                }
            }
        }
        return profit;
    }
}
