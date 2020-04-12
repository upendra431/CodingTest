/**
 * 
 */
package com.learning.hackerrank.Medium;

import java.util.Scanner;

/**
 * @author us1endra
 *
 */
public class SubstringDiff 
{
	// Coms1lete the substringDiff function below.
    static int substringDiff(int k, String s1, String s2) 
    {
		int maxL = 0;
		int s1size=s1.length();
		for (int i = 0; i <s1size  && maxL < s1size - i; i++) {
			for (int j = 0; j < s1size && maxL < s1size - j; j++) {
				int counter = 0;
				int L = 0;
				int I = i;
				int J = j;
				while (I <s1size&& J < s1size) {
					if (s1.charAt(I) != s2.charAt(J)) {
						counter++;
					}
					L++;
					if (counter <= k) {
						maxL = Math.max(maxL, L);
					} else {
						break;
					}
					I++;
					J++;
				}
			}
		}

       return maxL;
      }

    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
    	int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            String[] kS1S2 = scanner.nextLine().split(" ");

            int k = Integer.parseInt(kS1S2[0]);

            String s1 = kS1S2[1];

            String s2 = kS1S2[2];

            int result = substringDiff(k, s1, s2);
            System.out.println(result);

	}
    }
    
}
