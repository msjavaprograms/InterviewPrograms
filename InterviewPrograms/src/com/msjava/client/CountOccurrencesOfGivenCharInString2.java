package com.msjava.client;

import java.util.Scanner;

public class CountOccurrencesOfGivenCharInString2 {

	public static void main(String[] args) {
		System.out.println("Enter the test String : ");
		Scanner sc = new Scanner(System.in);
		String testString = sc.nextLine();
		System.out.println("Enter the Char to search in String : ");
		String searchString = sc.nextLine();
		testString = testString.replaceAll(" ", "");
		int occur= testString.length() - testString.replaceAll(searchString, "").length();
		System.out.println("Occurence of Given Char " + searchString + " :" + occur);
	}
}
