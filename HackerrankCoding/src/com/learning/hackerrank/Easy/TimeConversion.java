/**
 * 
 */
package com.learning.hackerrank.Easy;

import java.util.Scanner;

/**
 * @author upendra
 *
 */
public class TimeConversion {
	static String timeConversion(String s) {
       
		int hour = Integer.parseInt(s.substring(0, 2));
		int minute = Integer.parseInt(s.substring(3, 5));
		int second = Integer.parseInt(s.substring(6, 8));
		String meridiem = s.substring(8, 10);

		hour += ((meridiem.equals("PM") && hour != 12) ? 12 : 0);// Performs conversion based on current meridiem
		hour -= ((meridiem.equals("AM") && hour == 12) ? 12 : 0);

		return String.format("%02d", hour) + ":" + String.format("%02d", minute) + ":" + String.format("%02d", second);

    }
	public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner input = new Scanner(System.in);
        String time = input.nextLine();
        System.out.println(timeConversion(time));
        
        }
}
