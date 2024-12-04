package lab4;

//****************************************************************
//BandBooster.java
//
//Models a band booster who sells candy boxes for a fundraiser.
//****************************************************************
public class BandBooster {
 private String name; // Name of the band booster
 private int boxesSold; // Number of boxes sold by the booster

 // Constructor
 public BandBooster(String boosterName) {
     name = boosterName;
     boxesSold = 0;
 }

 // Returns the name of the band booster
 public String getName() {
     return name;
 }

 // Updates the number of boxes sold by adding the given amount
 public void updateSales(int additionalBoxes) {
     boxesSold += additionalBoxes;
 }

 // Returns a string containing the name and total boxes sold
 public String toString() {
     return name + ": " + boxesSold + " boxes";
 }
}
