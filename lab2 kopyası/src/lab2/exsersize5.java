package lab2;

import java.util.Scanner;

public class exsersize5 {

	public static void main(String[] args) {
		String name;
        int number;
        int numSq;

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your name, please: ");
        name = scan.nextLine();

        System.out.print("What is your favorite number? ");
        number = scan.nextInt();

        numSq = number * number;

        System.out.println(name + ", the square of your number is " + numSq);

	}

}
