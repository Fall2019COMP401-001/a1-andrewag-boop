package a1;

import java.util.Scanner;

public class A1Novice {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int numCustomer = scan.nextInt();
		for (int i = 0; i < numCustomer; i++) {
			String output = "";
			output = output + initial(scan);
			output = output + lastName(scan);
			output = output + price(scan);
			System.out.println(output);
		}
	}
	private static String initial(Scanner scan) {
		char letter = scan.next().charAt(0);
		String let = String.valueOf(letter);
		String initial = let + ". ";
		return initial;
	}
	private static String lastName(Scanner scan) {
		String last = scan.next();
		String colon = last + ": ";
		return colon;
	}
	private static String price(Scanner scan) {
		int numItems = scan.nextInt();
		double totalCost = 0.00;
		for (int i = 0; i < numItems; i++) {
			double numPiece = scan.nextDouble();
			String namePiece = scan.next();
			double pricePiece = scan.nextDouble();
			double combine = numPiece*pricePiece;
			totalCost = totalCost + combine;
		}
		String totalCostString = String.format("%.2f", totalCost);
		return totalCostString;
	}
	// You can define / use static helper methods here.
}
