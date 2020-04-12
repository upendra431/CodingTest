/**
 * 
 */
package com.learning.hackerrank.Easy.Algorithms.Warmup;

import java.util.Scanner;

/**
 * @author upendra
 *
 */
public class Staircase {
    static void staircase(int n) {
    	for(int r=0;r<n;r++)
    	{
    	for(int i=n-r-1;i>0;i--)
    	{
    	System.out.print(" ");	
    	}
    	for(int c=0;c<=r;c++)
    	{
    		System.out.print("#");	
    	}
    	System.out.println();
    	}

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        staircase(n);

        scanner.close();
    }
}
