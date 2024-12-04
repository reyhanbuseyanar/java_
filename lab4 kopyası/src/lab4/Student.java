package lab4;

//****************************************************************
//Student.java
//
//Define a student class that stores name, score on test 1, and
//score on test 2. Methods prompt for and read in grades,
//compute the average, and return a string containing student’s info.
//****************************************************************
import java.util.Scanner;

public class Student {
 // Declare instance data
 private String name;
 private double test1;
 private double test2;

 // Constructor
 public Student(String studentName) {
     name = studentName;
     test1 = 0.0;
     test2 = 0.0;
 }

 // inputGrades: prompt for and read in student's grades for test1 and test2
 public void inputGrades() {
     Scanner scanner = new Scanner(System.in);

     System.out.print("Enter " + name + "'s score for test1: ");
     test1 = scanner.nextDouble();

     System.out.print("Enter " + name + "'s score for test2: ");
     test2 = scanner.nextDouble();
 }

 // getAverage: compute and return the student's test average
 public double getAverage() {
     return (test1 + test2) / 2.0;
 }

 // getName: return the student's name
 public String getName() {
     return name;
 }

 // toString: return a string containing the student's name and test scores
 public String toString() {
     return "Name: " + name + " Test1: " + test1 + " Test2: " + test2;
 }
}
