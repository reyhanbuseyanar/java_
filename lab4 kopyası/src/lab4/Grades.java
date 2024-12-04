package lab4;

//****************************************************************
//Grades.java
//
//Use Student class to get test grades for two students
//and compute averages
//
//****************************************************************
public class Grades {
 public static void main(String[] args) {
     // Create student1 (Mary)
     Student student1 = new Student("Mary");

     // Create student2 (Mike)
     Student student2 = new Student("Mike");

     // Input grades for Mary
     student1.inputGrades();

     // Print average for Mary
     System.out.println("The average for " + student1.getName() + " is " + student1.getAverage());

     // Input grades for Mike
     student2.inputGrades();

     // Print average for Mike
     System.out.println("The average for " + student2.getName() + " is " + student2.getAverage());

     // Print student details using toString
     System.out.println("\nStudent Details:");
     System.out.println("Student 1: " + student1);
     System.out.println("Student 2: " + student2);
 }
}
