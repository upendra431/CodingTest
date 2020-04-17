/**
 * 
 */
package com.upendra;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

/**
 * @author upendra
 *
 */
public class Kangaroo {
	static String kangaroo(int x1, int v1, int x2, int v2) {
		 if (x1 == x2) {
			    return "YES";
			  } else if ((x1 < x2 && v1 > v2) || (x1 > x2 && v1 < v2)) {
			    float t;
			    t = (float) (x2 - x1) / (float) (v1 - v2);
			    if (Math.floor(t)== t) {
			      return "YES";
			    }
			  }
			  return "NO";
	}

	private static final Scanner scanner = new Scanner(System.in);
	BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
	String[] x1V1X2V2 = scanner.nextLine().split(" ");

	public static void main(String[] args) throws IOException {
		BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
		String[] x1V1X2V2 = scanner.nextLine().split(" ");
		int x1 = Integer.parseInt(x1V1X2V2[0]);

		int v1 = Integer.parseInt(x1V1X2V2[1]);

		int x2 = Integer.parseInt(x1V1X2V2[2]);

		int v2 = Integer.parseInt(x1V1X2V2[3]);

		String result = kangaroo(x1, v1, x2, v2);

		bufferedWriter.write(result);
		bufferedWriter.newLine();

		bufferedWriter.close();

		scanner.close();

	}
}
