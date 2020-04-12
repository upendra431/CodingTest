package com.learning.hackerrank.Medium;

import java.util.Scanner;

public class LegoBlocks1
{
    private static final int MODULO = 1000000007;
    static int[] cache;

    public static int pow(int x, int n, int p) {
        int result = 1;
        while (n > 0) {
            if ((n & 1) == 1) {
                result = (result * x) % p;
            }

            x = (x * x) % p;
            n = n >> 1;
        }

        return result;
    }

    private static int solveSingleRow(int width) {
        if (width == 0) {
            return 1;
        } else if (width < 0) {
            return 0;
        } else {
            if (cache[width] == -1) {
                cache[width] = (solveSingleRow(width - 1) + solveSingleRow(width - 2) + solveSingleRow(width - 3) + solveSingleRow(width - 4)) % MODULO;
            }
            return cache[width];
        }
    }

    private static int[][] solve(int height, int width) {
        int[][] a = new int[height + 1][width + 1];
        int[][] s = new int[height + 1][width + 1];
        cache = new int[width + 1];

        for (int w = 0; w <= width; w++) {
            cache[w] = -1;
        }

        for (int w = 1; w <= Math.min(width, 4); w++) {
            s[1][w] = 1;
        }

        for (int h = 1; h <= height; h++) {
            for (int w = 1; w <= width; w++) {
                int oneRow = solveSingleRow(w);
                a[h][w] = pow(oneRow, h, MODULO);
            }

            for (int w = 1; w <= width; w++) {
                int bad = 0;
                for (int l = 1; l <= w - 1; l++) {
                    bad += ((s[h][l] * a[h][w - l]) % MODULO);
                    bad = bad % MODULO;
                }

                s[h][w] = (a[h][w] - bad) % MODULO;
            }

        }
        
        return s;
    }
    static int legoBlocks(int n, int m) {
    	 
        int[][] s = solve(1000, 1000);
        int result = s[n][m];
        while (result < 0) {
            result = result + MODULO;
        }
        return result;

    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tests = scanner.nextInt();
        for (int t = 0; t < tests; t++) {
            int n = scanner.nextInt();
            int m = scanner.nextInt();
            System.out.println(legoBlocks(n, m));
        }

    }
}
