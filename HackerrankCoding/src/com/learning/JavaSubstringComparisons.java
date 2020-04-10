package com.learning;

import java.util.Scanner;

public class JavaSubstringComparisons 
{
public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    String s = sc.nextLine();
    int k = sc.nextInt();
    System.out.println(getSmallestAndLargest(s, k));
}
public static String getSmallestAndLargest(String s, int k)
{
	String smallest="";
    String largest="";
    for(int i = 0;i<=s.length()-k;i++){
        String subString = s.substring(i,i+k);
        if(i == 0){
            smallest = subString;
        }
        if(subString.compareTo(largest)>0){
            largest = subString;
        }else if(subString.compareTo(smallest)<0)
            smallest = subString;
    }
    return smallest + "\n" + largest;
}
}
