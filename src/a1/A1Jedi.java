package a1;

import java.util.Scanner;
import java.util.Arrays;

public class A1Jedi {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int numItems = scan.nextInt(); // 6
		double[] allPrices = new double[numItems]; // Initializes Double Array
		String[] ingredientNames = new String[numItems]; // Initializes String Array
		int[] countingCustomers = new int[numItems];
		int[] countingItems = new int[numItems];

		for (int i = 0; i < numItems; i++) {
			ingredientNames[i] = scan.next();
			allPrices[i] = scan.nextDouble();
		} // for loop fills in shopping list using scanner
		// ends shopping list arrays
		int numPeople = scan.nextInt();//number of people buying
		for (int i = 0; i < numPeople; i++) {// for loop running for each person
			boolean[] boughtOrNot = new boolean[numItems];
			String firstName = scan.next();
			String lastName = scan.next();
			int numList = scan.nextInt();//how many items the person bought
			for (int j = 0; j < numList; j++) {// for loop runs for each item the person bought
				int numBought = scan.nextInt();// how many of each item she/he bought
				String itemName = scan.next();// name of individual item
				for (int k = 0; k < numItems; k++) {// runs for an individual item from shopping list
					if (itemName.equals(ingredientNames[k])) {
						boughtOrNot[k] = true;//                ***********MAKE SURE PLUS EQUALS WORKS**********
						countingItems[k] += numBought;//         ***************MAKE SURE PLUS EQUALS WORKS********
					}
				}// for loops adds to a counting array if the person bought an item
			}
			for (int b = 0; b < numItems; b++) {
				if (boughtOrNot[b]) {
					countingCustomers[b] += 1;
				}
			}
		}

		// convert countingCustomers and countingItems to strings
		String strCountingCustomers[] = Arrays.stream(countingCustomers)
				.mapToObj(String::valueOf)
				.toArray(String[]::new);
		String strCountingItems[] = Arrays.stream(countingItems)
				.mapToObj(String::valueOf)
				.toArray(String[]::new);
		for (int m = 0; m < numItems; m++) {
			strCountingItems[m] = strCountingItems[m] + " ";
			if (countingCustomers[m] == 0) {
				strCountingCustomers[m] = "No";
				strCountingItems[m] = "";
			}
		}
		for (int n = 0; n < numItems; n++) {
			System.out.println(strCountingCustomers[n] + " customers bought " + strCountingItems[n] + ingredientNames[n]);
		}
	}
	
	// You can define / use static helper methods here.
}
