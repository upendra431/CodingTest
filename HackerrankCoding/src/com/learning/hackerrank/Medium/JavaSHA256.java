package com.learning.hackerrank.Medium;

import java.security.MessageDigest;
import java.util.Scanner;

/**
 * 
 * @author upendra
 *
 */
public class JavaSHA256 {
	public static void main(String[]args){
		Scanner cin=new Scanner(System.in);
		String s=cin.nextLine();
		try{
			MessageDigest md=MessageDigest.getInstance("SHA-256");
			md.update(s.getBytes());
			byte[] digest=md.digest();
			for(byte b:digest)System.out.printf("%02x",b);
		}catch(Exception e){}
	}
}
