/**
 * 
 */
package com.upendra;

import static java.util.stream.Collectors.toList;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

/**
 * @author upendra
 *
 */
public class BetweenTwoSets {
	public static int getTotalX(List<Integer> a, List<Integer> b) {
		// Write your code here

		int maxA = Collections.max(a);
		int minB = Collections.min(b);
		int counter=0;
		for (int i = maxA; i <= minB; i++) {
			boolean sentinel = false;
			for (int j = 0; j < a.size(); j++) {
				if (i % a.get(j) != 0) {
					sentinel = true;
					break;
					
				}
			}
			for (int j = 0; j < b.size(); j++) {
				if (b.get(j) % i != 0) {
					sentinel = true;
					break;
				}
			}

			if (!sentinel) {
				counter++;
			}
		}

		return counter;
	}
	 public static void main(String[] args) throws IOException {
		 BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
	        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
	        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
	            .map(Integer::parseInt)
	            .collect(toList());
	        List<Integer> brr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
	            .map(Integer::parseInt)
	            .collect(toList());
	        int total = getTotalX(arr, brr);
	        bufferedWriter.write(String.valueOf(total));
	        bufferedWriter.newLine();
	        bufferedReader.close();
	        bufferedWriter.close();
	        }
}
