package com.learning.hackerrank.Easy.Algorithms.Warmup;

import java.util.Scanner;

public class MiniMaxSum 
{
	static void miniMaxSum(int[] arr) {
	long min = Long.MAX_VALUE;
    long max = 0;
    long sum = 0;
    for(int i=0; i<arr.length; i++)
    {
        long curr = arr[i];  
        if(max < curr)
        {
            max = curr;
        }
        if(min > curr)
        {
            min = curr;
        }
        
        sum += curr;
    }
    long minSum = sum - max;//Removes the largest of the 5 numbers to get the min sum
    long maxSum = sum - min;//Removes the smallest of the 5 numbers to get the max sum
    System.out.println(minSum + " " + maxSum);
	}
	private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] arr = new int[5];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < 5; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        miniMaxSum(arr);

        scanner.close();
    }

}
