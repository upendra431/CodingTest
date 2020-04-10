package com.learning.hackerrank.Medium;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Student{
	   private int token;
	   private String name;
	   private double cgpa;
	   public Student(int id, String fname, double cgpa) {
	      super();
	      this.token = id;
	      this.name = fname;
	      this.cgpa = cgpa;
	   }
	   public int getToken() {
	      return token;
	   }
	   public String getName() {
	      return name;
	   }
	   public double getCgpa() {
	      return cgpa;
	   }
	   
	   public int compareTo(Student s)
	   {
	       if(this.cgpa < s.cgpa){  
	           return -1;
	       }else if (this.cgpa > s.cgpa){
	            return 1; 
	       }
	       if(this.name.compareTo(s.name) > 0){
	           return -1;
	       }else if(this.name.compareTo(s.name) < 0){
	           return 1;
	       }else{
	            if(this.token < s.token){ 
	               return -1;
	            }
	       }
	       return 1;
	   }
	       
	   public String toString()
	   {
	       return ""+ this.token +" " + this.name + " " + this.cgpa;
	   }
	}
public class JavaPriorityQueue 
{
public static ArrayList<Student> studentQueue = new ArrayList<>();
    private final static Scanner scan = new Scanner(System.in);
    private final static Priorities priorities = new Priorities();
    public static void main(String[] args) {
        int totalEvents = Integer.parseInt(scan.nextLine());    
        List<String> events = new ArrayList<>();
        
        while (totalEvents-- != 0) {
            String event = scan.nextLine();
            events.add(event);
        }
        
        List<Student> students = priorities.getStudents(events);
        
        if (students.isEmpty()) {
            System.out.println("EMPTY");
        } else {
            for (Student st: students) {
            	if(st.getCgpa()>=0 && st.getCgpa()<=4.0)
                System.out.println(st.getName());
            }
        }
    }
}
class Priorities
{
	
public static ArrayList<Student> studentQueue = new ArrayList<>();
    
    public  void insertStudent(Student s)
    {
        int insertPos = 0;
        for(int i = 0;i < studentQueue.size() ;i++){
            if(studentQueue.get(insertPos).compareTo(s)>0){
                insertPos = i+1;
            }else{
                break;
            }
        }
        studentQueue.add(insertPos,s);
    }
	
	public List<Student> getStudents(List<String> events)
	{
		events.forEach(event->{
	        String[] eventArr = event.split(" ");
	        if(eventArr.length == 1){
	            if(!studentQueue.isEmpty()){
	                studentQueue.remove(0);
	            }
	        }else{
	            Student s = new Student(Integer.parseInt(eventArr[3]),eventArr[1],Double.parseDouble(eventArr[2]));
	            insertStudent(s);
	        }   
		});
		return studentQueue;
	}
}