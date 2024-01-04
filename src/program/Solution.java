package program;

import java.util.Scanner;

public class Solution {
	
	private static Scanner sc = new Scanner(System.in);
	private static Integer arrayLen;
	private static Integer item;
	private static Integer choice;
	
	public static void main(String[] args) {
		clearScreen();
		getDataFromUser();
		clearScreen();
		selectDataStructure();
		clearScreen();
		executeBinarySearch();
		sc.close();
	}
	
	public static void getDataFromUser() {
		System.out.print("Enter the array len: ");
		arrayLen = sc.nextInt();
		System.out.print("Enter the number to find: ");
		item = sc.nextInt();
	}
	
	public static void selectDataStructure() {
		System.out.println("Select a Data Structure: \n" + "1 - Array\n" + "2 - ArrayList");
		choice = sc.nextInt();
	}
	
	public static void executeBinarySearch() {
		if (choice.equals(1)) {
			ArraySolution arraySoluion = new ArraySolution(arrayLen, item);
			arraySoluion.binarySearch();
		} else if (choice.equals(2)) {
			ArrayListSoluition arrayListSoluition = new ArrayListSoluition(arrayLen, item);
			arrayListSoluition.binarySearch();
		} else System.out.println("Invalid Answer!");
	}
	
	public static void clearScreen() {
		System.out.print("\033[H\033[2J");
		System.out.flush();
	}
}
