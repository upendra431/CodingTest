/**
 * 
 */
package com.learning.hackerrank.Easy;



import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;
/**
 * @author upendra
 *
 */
public class ComparetheTriplets {
	
	
	// Complete the compareTriplets function below.
	static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
		List<Integer> list = new ArrayList<>();
		int al = 0;
		int bo = 0;
		for (int i = 0; i < a.size(); i++) {
			al = al + ((a.get(i) > b.get(i)) ? 1 : 0);
			bo = bo + ((b.get(i) > a.get(i)) ? 1 : 0);
		}
		list.add(al);
		list.add(bo);
		return list;
	}

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        List<Integer> a = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        List<Integer> b = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        List<Integer> result = compareTriplets(a, b);

        bufferedWriter.write(
            result.stream()
                .map(Object::toString)
                .collect(joining(" "))
            + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
    }
//	public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int a0 = in.nextInt();
//        int a1 = in.nextInt();
//        int a2 = in.nextInt();
//        int b0 = in.nextInt();
//        int b1 = in.nextInt();
//        int b2 = in.nextInt();
//        
//        int alice = ((a0 > b0)?1:0) + ((a1 > b1)?1:0) + ((a2 > b2)?1:0);
//        int bob = ((b0 > a0)?1:0) + ((b1 > a1)?1:0) + ((b2 > a2)?1:0);
//        
//        
//        System.out.println(alice + " " + bob);
//    }
}
