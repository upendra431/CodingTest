/**
 * 
 */
package com.learning.hackerrank.Easy;

import java.util.Scanner;

/**
 * @author upendra
 *
 */
public class JavaSubarray 
{
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size     = scan.nextInt();
        int[] array = new int[size];        
        for (int i = 0; i < size; i++) {
            array[i] = scan.nextInt();
        }
        scan.close();
        
        System.out.println(negativeSubarrays(array));
    }
	private static int negativeSubarrays(int[] array) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            int sum = 0;
            for (int j = i; j < array.length; j++) {
                sum += array[j];
                if (sum < 0) {
                    count++;
                }
            }
        }
        return count;
    }
}
