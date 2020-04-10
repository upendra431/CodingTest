package com.learning;
/* Java String Token
Given a string, find number of words in that string. For this problem a word is defined by a string of one or more 
english alphabets.
There are multiple ways to tokenize a string in java, learn how to tokenize a string in java and demonstrate your 
skill by solving this problem!
Input Format
A string not more than 400000 characters long. The string can be defined by following regular expression:
[A-Za-z !,?.\_'@]+
That means the string will only contain english alphabets, blank spaces and this characters: "!,?._'@".
Output Format
In the first line, print number of words n in the string. The words don't need to be unique. In the next n lines, 
print all the words you found in the order they appeared in the input.
Sample Input
He is a very very good boy, isn't he?
Sample Output
10
He
is
a
very
very
good
boy
isn
t
he
*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class JavaStringToken {

	public static void main(String[] args) {
		 String pattern = "(?i)\\b(\\w+)(\\s+\\1)+\\b";
	        Pattern r = Pattern.compile(pattern,Pattern.CASE_INSENSITIVE);
	        Scanner in = new Scanner(System.in);
	        int testCases = Integer.parseInt(in.nextLine());
	        while(testCases>0){
	            String input = in.nextLine();
	            Matcher m = r.matcher(input);
	            while(m.find( )){
	                input = input.replaceAll(pattern,"$1");
	            }
	            System.out.println(input);
	            testCases--;
	        }
}
}