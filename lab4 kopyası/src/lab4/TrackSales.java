package lab4;

//****************************************************************
//TrackSales.java
//
//Uses BandBooster objects to track candy sales for two boosters.
//****************************************************************
import java.util.Scanner;

public class TrackSales {
 public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);

     // Read names of two band boosters
     System.out.print("Enter the name of the first band booster: ");
     BandBooster booster1 = new BandBooster(scanner.nextLine());

     System.out.print("Enter the name of the second band booster: ");
     BandBooster booster2 = new BandBooster(scanner.nextLine());

     // Record sales for 3 weeks
     for (int week = 1; week <= 3; week++) {
         System.out.println("\nWeek " + week);

         System.out.print("Enter the number of boxes sold by " + booster1.getName() + " this week: ");
         int sales1 = scanner.nextInt();
         booster1.updateSales(sales1);

         System.out.print("Enter the number of boxes sold by " + booster2.getName() + " this week: ");
         int sales2 = scanner.nextInt();
         booster2.updateSales(sales2);
     }

     // Print the total sales for both boosters
     System.out.println("\nSales Summary:");
     System.out.println(booster1);
     System.out.println(booster2);
 }
}
