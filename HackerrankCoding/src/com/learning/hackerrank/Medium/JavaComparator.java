package com.learning.hackerrank.Medium;
/* Java Comparator
Comparators are used to compare two objects to sort them. This problem will test your knowledge on Java Comparators.
There are N players in a tournament. You will be given the name of each player and his score. 
You need to sort the players in decreasing order by score. If two players have the same score, the one 
whose name is lexicographically larger should appear first.
Note: We have already provided you with the partially completed code in the editor. Your task is to 
create the class Checker which uses a comparator desc to sort the players.
A string is lexicographically smaller than another string if it appears earlier in a standard dictionary. 
For example, "cat" is lexicographically smaller than "dog", but larger than "cab" or "ca".
Input Format
The first line contains an integer N, denoting the number of players. The next N lines contain the name of a player
and his score separated by a space. Two players can have the same name. A name will consist of lowercase 
English characters. The score of a player can range from 0 to 1000. You don't need to worry about any other constraints.
Output Format
Print each player and their space-separated score on a different line according to the directions in the problem statement.
Sample Input:

5
amy 100
david 100
heraldo 50
aakansha 75
aleksa 150

Sample Output: 

aleksa 150
david 100
amy 100
aakansha 75
heraldo 50


*/
import java.util.*;

class Checker implements Comparator<Player> {

	  @Override
	  public int compare(Player a1, Player a2) {
	    if (a1.score < a2.score) {
	      return 1;
	    } else if (a1.score > a2.score) {
	      return -1;
	    } else {
	      return a1.name.compareTo(a2.name);
	    }
	  }
	}  
class Player{
   String name;
   int score;
   
   Player(String name, int score){
       this.name = name;
       this.score = score;
   }
}


public class JavaComparator {
	 public static void main(String[] args) {
	        Scanner scan = new Scanner(System.in);
	        int n = scan.nextInt();

	        Player[] player = new Player[n];
	        Checker checker = new Checker();
	        
	        for(int i = 0; i < n; i++){
	            player[i] = new Player(scan.next(), scan.nextInt());
	        }
	        scan.close();
	     
	        Arrays.sort(player, checker);
	        for(int i = 0; i < player.length; i++){
	            System.out.printf("%s %s\n", player[i].name, player[i].score);
	        }
	    }
}
