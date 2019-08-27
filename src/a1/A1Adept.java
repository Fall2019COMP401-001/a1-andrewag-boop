package a1;

import java.util.Scanner;
import java.util.Arrays;

public class A1Adept {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// starts shopping list arrays
		int numItems = scan.nextInt(); // 6
		double[] allPrices = new double[numItems]; // Initializes Double Array
		String[] ingredientNames = new String[numItems]; // Initializes String Array
		for (int i = 0; i < numItems; i++) {
			ingredientNames[i] = scan.next();
			allPrices[i] = scan.nextDouble();
		} // for loop fills in shopping list using scanner
		// ends shopping list arrays
		int numPeople = scan.nextInt(); // 3
		String[] allPeople = new String[numPeople]; // Initializes array of people
		double[] correspondingSpent = new double[numPeople]; // Initializes array for prices spent for each person
		for (int j = 0; j < numPeople; j++) {// for loop runs 3 times
			String firstName = scan.next();
			String lastName = scan.next();
			String fullName = firstName + " " + lastName;
			// ^^ scans names to add to array of people ^^
			int numIngredients = scan.nextInt();// starts running initially for 3 2 Banana 1 Orange 2 Milk, then for rest
			double totalIngredientCost = 0.00;// Initializes totalIngredientCost double variable
			
			for (int k = 0; k < numIngredients; k++) {// for loop runs 3 times for Carrie
				
				int numBought = scan.nextInt();// 2 for Carrie
				String boughtItem = scan.next();// Banana for Carrie
				double correspondingPrice = 0.00;// Initializes corresponding price
				for (int l = 0; l < numItems; l++) {// goes through shopping list arrays
					if (boughtItem.equals(ingredientNames[l])) {
						correspondingPrice = allPrices[l];//eventually copies down banana price for Carrie
					}
				}
				double dNumBought = (double) numBought;//converts int number of each item bought to a double
				double ingredientAdd = correspondingPrice * dNumBought;// finds how much all of one ingredient cost
				totalIngredientCost = totalIngredientCost + ingredientAdd;// adds to overall cost
			}// loops ends, this acts on individual people
			allPeople[j] = fullName;
			correspondingSpent[j] = totalIngredientCost;
		}// loop ends, runs for all people
		//System.out.println(Arrays.toString(correspondingSpent));
		//System.out.println(Arrays.toString(allPeople));
		double highestValue = correspondingSpent[0];
		String highestName = allPeople[0];
		for (int m = 0; m < (numPeople-1); m++) {
			if (highestValue < correspondingSpent[m+1]) {
				highestValue = correspondingSpent[m+1];
				highestName = allPeople[m+1];
			}		
		}
		double lowestValue = correspondingSpent[0];
		String lowestName = allPeople[0];
		for (int n = 0; n < (numPeople - 1); n++) {
			if (lowestValue > correspondingSpent[n+1]) {
				lowestValue = correspondingSpent[n+1];
				lowestName = allPeople[n+1];
			}
		}
		double addTotalCost = 0.00;
		for (int o = 0; o < (numPeople); o++) {
			addTotalCost = addTotalCost + correspondingSpent[o];
		}
		double avgCost = addTotalCost/numPeople;
		String highestValueFormatted = String.format("%.2f", highestValue);
		String lowestValueFormatted = String.format("%.2f", lowestValue);
		String avgCostFormatted = String.format("%.2f", avgCost);
		System.out.println("Biggest: " + highestName + " (" + highestValueFormatted + ")");
		System.out.println("Smallest: " + lowestName + " (" + lowestValueFormatted + ")");
		System.out.println("Average: " + avgCostFormatted);
		
	}
	
	
	// You can define / use static helper methods here.
}
