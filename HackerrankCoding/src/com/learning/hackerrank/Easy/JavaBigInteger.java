package com.learning.hackerrank.Easy;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

public class JavaBigInteger {
	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
		 * class should be named Solution.
		 */
		Scanner sc = new Scanner(System.in);
		BigInteger bi1 = new BigInteger(sc.nextLine()); 
		BigInteger bi2 = new BigInteger(sc.nextLine()); 

		BigInteger bigSum = bi1.add(bi2);

		BigInteger bigProduct = bi1.multiply(bi2);

		System.out.println(bigSum);
		System.out.println(bigProduct);

	}
}
