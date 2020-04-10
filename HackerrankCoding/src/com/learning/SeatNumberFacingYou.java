package com.learning;
/**
 * Akash and Vishal are quite fond of travelling. They mostly travel by railways. They were travelling in a train one day and they got interested in the seating arrangement of their compartment. The compartment looked something like 
 */
/**
 * 
 */

import java.util.*;
import java.io.IOException;
import java.lang.*;

public class SeatNumberFacingYou {
	public static void main(String args[]) throws IOException {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();// 1
		int[] n = new int[t];
		for (int i = 0; i < t; i++) {
			n[i] = sc.nextInt();
		}
		String seat;
		int opp;
		for (int i = 0; i < n.length; i++) {

			if (n[i] % 12 > 0 && n[i] % 12 <= 6) {

				if ((n[i] % 6) != 0) {
					opp = n[i] + 1 + 2 * (6 - (n[i] % 6));
				} else
					opp = n[i] + 1;
			} else {
				if ((n[i] % 6) != 0) {
					opp = n[i] - 1 - 2 * ((n[i] % 6) - 1);
				} else
					opp = n[i] - 10 - 1;
			}

			if (opp % 6 == 0 || opp % 6 == 1)
				seat = "WS";
			else if (opp % 6 == 3 || opp % 6 == 4)
				seat = "AS";
			else
				seat = "MS";
			System.out.println(opp + " " + seat);
		}
	}
}