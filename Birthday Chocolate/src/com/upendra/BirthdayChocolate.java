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
import java.util.List;
import java.util.stream.Stream;
public class BirthdayChocolate {

	
	// Complete the birthday function below.
	static int birthday(List<Integer> s, int d, int m) {
		int n = s.size();
		if (m > n) {
			return 0;
		}
		int counter = 0;
		int acc = 0;
		for (int i = 0; i < m; i++) {
			acc += s.get(i);
		}
		for (int i = m; i < n; i++) {
			if (acc == d) {
				counter++;
			}
			acc += s.get(i);
			acc -= s.get(i - m);
		}

		if (acc == d) {
			counter++;
		}

		return counter;

	}
	/**
	 * @param args
	 */
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> s = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        String[] dm = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int d = Integer.parseInt(dm[0]);

        int m = Integer.parseInt(dm[1]);

        int result = birthday(s, d, m);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }

}
