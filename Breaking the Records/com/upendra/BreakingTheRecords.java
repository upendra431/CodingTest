/**
 * 
 */
package com.upendra;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * @author upendra
 *
 */
public class BreakingTheRecords {

	static int[] breakingRecords(int[] scores) {

		int maximum =scores[0] ;
        int minimum = maximum;
		
		int minCounter = 0;
		int maxCounter = 0;
		
		for(Integer num:scores)
		{
			if (num > maximum) 
			{
				maximum=num;
				maxCounter++;
			}

			if (num < minimum) {
				minimum=num;
				minCounter++;
			}	
		}
		
		
		int arr[] = new int[2];
		arr[0] = maxCounter;
		arr[1] = minCounter;
		return arr;

	}
	/**
	 * @param args
	 */
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] scores = new int[n];

        String[] scoresItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int scoresItem = Integer.parseInt(scoresItems[i]);
            scores[i] = scoresItem;
        }

        int[] result = breakingRecords(scores);

        for (int i = 0; i < result.length; i++) {
            bufferedWriter.write(String.valueOf(result[i]));

            if (i != result.length - 1) {
                bufferedWriter.write(" ");
            }
        }

        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
