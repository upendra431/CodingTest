/**
 * 
 */
package com.learning.hackerrank.Medium;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author upendra
 *
 */
public class LegoBlocks {
	private static int legoBlocks(int n, int m) {
		return solidBlocks(n, m, new HashMap<>()) % 1000000007;
	}

	private static int solidBlocks(int n, int m, Map<String, Integer> solidMemo) {
		if (m == 0) {
			return 0;
		}
		String key = n + "|" + m;
		if (solidMemo.containsKey(key)) {
			return solidMemo.get(key);
		}
		Map<Integer, Integer> allMemo = new HashMap<>();
		int total = (int) Math.pow(allBlocks(m, allMemo), n);
		for (int i = 1; i <= m - 1; i++) {
			int a = solidBlocks(n, i, solidMemo);
			int b = (int) Math.pow(allBlocks(m - i, allMemo), n);
			int substract = (a * b);
			total -= substract;
		}
		solidMemo.put(key, total);
		return total;
	}

	private static int allBlocks(int width, Map<Integer, Integer> memo) {
		if (width < 0) {
			return 0;
		}
		if (width == 0) {
			return 1;
		}
		if (memo.containsKey(width)) {
			return memo.get(width);
		}
		int max = 0;
		for (int i = 1; i <= 4; i++) {
			max += allBlocks(width - i, memo);
		}
		memo.put(width, max);
		return max;
	}

	    private static final Scanner scanner = new Scanner(System.in);

	    public static void main(String[] args) throws IOException {
	        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

	        int t = Integer.parseInt(scanner.nextLine().trim());

	        for (int tItr = 0; tItr < t; tItr++) {
	            String[] nm = scanner.nextLine().split(" ");

	            int n = Integer.parseInt(nm[0].trim());

	            int m = Integer.parseInt(nm[1].trim());

	            int result = legoBlocks(n, m);

	            bufferedWriter.write(String.valueOf(result));
	            bufferedWriter.newLine();
	        }

	        bufferedWriter.close();
	    }
	}