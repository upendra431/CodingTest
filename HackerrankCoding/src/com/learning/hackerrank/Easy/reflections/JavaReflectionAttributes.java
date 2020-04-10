package com.learning.hackerrank.Easy.reflections;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;

/*JAVA reflection is a very powerful tool to inspect the attributes of a class in runtime. For example, we can retrieve the list of
public fields of a class using getDeclaredMethods().
In this problem, you will be given a class Solution in the editor. You have to fill in the incompleted lines so that it prints 
all the methods of another class called Student in alphabetical order. We will append your code with the Student class before 
running it. 
*/

class Student{
    private String name;
    private String id;
    private String email;

    public String getId() {
		return id;
	}
	public String getEmail() {
		return email;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
        return name;
    }
    public void setId(String id) {
        this.id = id;
    }
    public void setEmail(String email) {
        this.email = email;
    }
}
public class JavaReflectionAttributes {

	public static void main(String[] args) {
		Class student = Student.class; // uses class literal, not a function.
		Method[] methods = student.getDeclaredMethods();

		/* Get names from Methods */
		ArrayList<String> methodNames = new ArrayList<>();
		for (Method method : methods) {
			methodNames.add(method.getName());
		}

		/* Sort and print names */
		Collections.sort(methodNames);
		for (String name : methodNames) {
			System.out.println(name);
		}
	}
}