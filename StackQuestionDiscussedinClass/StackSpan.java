package com.dataStructures.StackQuestionDiscussedinClass;

public class StackSpan {

    public static int[] stockSpan(int[] prices)
    {
            int[] profit = new int[prices.length];
            int count = 1;

        for(int i = 0 ; i< prices.length ; i++)
        {
                int j =i -1;
                while(prices[j] <= prices[i] && j >= 0)
                {
                    count++;
                    j--;
                }

                profit[i] = count;

        }

        return profit;
    }

    public static void main(String[] args) {

        int[] arr  = {60 , 50 , 40 , 70 , 85 , 90 , 50};
        int[] ans = stockSpan(arr);
        for (int i =0 ; i<arr.length ; i++)
        {
            System.out.println(ans[i]);
        }

    }
}
