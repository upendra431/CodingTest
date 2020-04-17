/**
 * 
 */
package com.upendra;

/**
 * @author upendra
 *
 */
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;
class Result {

    /*
     * Complete the 'gradingStudents' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY grades as parameter.
     */

    public static List<Integer> gradingStudents(List<Integer> grades) 
    {
		List<Integer> roundupgrades = new ArrayList<>();
		grades.forEach(grade -> {
			if (grade >= 38) {
                int nextMultipleOfFive = 5 - (grade % 5) + grade;
                if (nextMultipleOfFive - grade < 3) {
                	roundupgrades.add(nextMultipleOfFive);
                }
                else
                {
                	roundupgrades.add(grade);	
                }
            }else
            {
            	roundupgrades.add(grade);	
            }
		});
		return roundupgrades;
    }

}
public class GradingStudents 
{
	public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        
        int gradesCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> grades = IntStream.range(0, gradesCount).mapToObj(i -> {
            try {
                return bufferedReader.readLine().replaceAll("\\s+$", "");
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        })
            .map(String::trim)
            .map(Integer::parseInt)
            .collect(toList());

        List<Integer> result = Result.gradingStudents(grades);
        System.out.println(result);
    }
}
