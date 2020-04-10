package com.learning;

import java.util.Scanner;

public class StringsIntroduction 
{
public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        System.out.println(A.length()+B.length());
        int rs=A.compareTo(B);
        if(rs<=0)
        {
        	System.out.println("No");
        }else
        {
        	System.out.println("Yes");
        }
        System.out.println(convertToTitleCaseIteratingChars(A)+" "+convertToTitleCaseIteratingChars(B));
        
        
    }
public static String convertToTitleCaseIteratingChars(String text) {
    if (text == null || text.isEmpty()) {
        return text;
    }
 
    StringBuilder converted = new StringBuilder();
 
    boolean convertNext = true;
    for (char ch : text.toCharArray()) {
        if (Character.isSpaceChar(ch)) {
            convertNext = true;
        } else if (convertNext) {
            ch = Character.toTitleCase(ch);
            convertNext = false;
        } else {
            ch = Character.toLowerCase(ch);
        }
        converted.append(ch);
    }
 
    return converted.toString();
}
}
