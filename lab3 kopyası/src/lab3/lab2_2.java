package lab3;

import java.util.Scanner;

public class lab2_2 {

	public static void main(String[] args) {

		     double x1, y1, x2, y2; 
		     double distance;       
		     
		     Scanner scan = new Scanner(System.in);
		     

		     System.out.print("Enter the coordinates of the first point : ");
		     x1 = scan.nextDouble();
		     y1 = scan.nextDouble();
		     
		   
		     System.out.print("Enter the coordinates of the second point: ");
		     x2 = scan.nextDouble();
		     y2 = scan.nextDouble();
		     
		   
		     distance = Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
		     
		     System.out.println("The distance between the points (" + x1 + ", " + y1 + ") and (" + x2 + ", " + y2 + ") is " + distance);
		     

		 }
		

	}


