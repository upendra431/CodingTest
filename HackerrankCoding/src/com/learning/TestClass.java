package com.learning;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class TestClass {
    public static void main(String args[] ) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine(); 
        if(name.contains("ZOO")|| name.contains("zoo"))
        System.out.println("Yes"); 
    }
}
