package javaPortfolio;

import java.util.Scanner;

public class Operators {
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double mealCost = scan.nextDouble(); // original meal price
        int tipPercent = scan.nextInt(); // tip percentage
        int taxPercent = scan.nextInt(); // tax percentage
        scan.close();
      
        // Write your calculation code here.
      
        // cast the result of the rounding operation to an int and save it as totalCost 
        double tipTotal = (mealCost*tipPercent)/100;
        double taxTotal = (taxPercent* mealCost)/100;
        
        double totalMealCost = tipTotal + taxTotal + mealCost;
        int totalCost = (int) Math.round(totalMealCost);
      
        // Print your result
        System.out.println("The total meal cost is " + totalCost +  " dollars.");
    }
}
