/**
 * 
 */
package com.learning.hackerrank.Medium;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @author upendra
 *
 *         XOR represents binary addition without the "carry" for each digit. We
 *         want to see how many values of x that will give us n+x = n^x, which
 *         is when XOR is the same as ADDITION. This happens when there are no
 *         "carries". To make sure there are no carries, for each digit in "n"
 *         that is a 1, we must have the corresponding digit in "x" be a 0. For
 *         each digit in "n" that is a 0, we can have the corresponding digit in
 *         "x" be either 0 or 1. Now we calculate the number of possibilities
 *         for "x" by counting the number of 0s in "n" (up to the most
 *         significant 1 in n), and doing 2^(number of 0s) (where ^ is
 *         exponentiation in this case) to count all combinations.
 */

public class XorAndSum {
	final private static int MAX_I = 314159;
    final private static int MOD = 1000000007;
    private static byte[] toByteArray(final char[] arr){
        final int n = arr.length;
        final byte[] ret = new byte[n];
        for(int i = 0; i < n; ++i){
            ret[i] = (byte)(arr[i] - '0');
        }
        return ret;
    }
    
    private static void reverse(final byte[] arr){
        for(int i = 0, j = arr.length - 1; i < j; ++i, --j){
            final byte c = arr[i];
            arr[i] = arr[j];
            arr[j] = c;
        }
    }
    
    private static byte[] extend(final byte[] arr, final int n){
        return (arr.length >= n) ? arr : Arrays.copyOf(arr, n);
    }
    static int xorAndSum(String a, String b) {
    	byte[] A = toByteArray(a.toCharArray());
        byte[] B = toByteArray(b.toCharArray());
        reverse(A);
        reverse(B);
        
        //SOLVE
        long sum = 0L;
        A = extend(A, B.length);
        B = extend(B, A.length);
        final int len = A.length;
        
        int i;
        long pow = 1L;
        int oneCount = 0;
        
        for(i = 0; i < len; ++i){
            oneCount += B[i];
            int multiplier = (A[i] == 0) ? oneCount : MAX_I - oneCount + 1;
            sum = (sum + pow*multiplier) % MOD;
            pow = (pow << 1L) % MOD;
        }
        
        while (i < MAX_I){
            ++i;
            sum = (sum + pow*oneCount) % MOD;
            pow = (pow << 1L) % MOD;
        }
        
        for(i = 0; i < len; ++i){
            sum = (sum + pow*oneCount) % MOD;
            pow = (pow << 1L) % MOD;
            oneCount -= B[i];
        }
        
        //OUTPUT
        return (int)sum;

    }
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) throws IOException {
        
    	
    	BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        String a = scanner.nextLine();

        String b = scanner.nextLine();

        int result = xorAndSum(a, b);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();
        //INPUT
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        br.close();
        br = null;
        
       
    }
    
   
}
