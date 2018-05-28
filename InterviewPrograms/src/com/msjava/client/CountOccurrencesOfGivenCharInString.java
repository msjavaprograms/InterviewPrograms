package com.msjava.client;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountOccurrencesOfGivenCharInString {

	public static void main(String[] args)
	{
		System.out.println("Enter the test string : ");
		Scanner sc = new Scanner(System.in);
		String testString = sc.nextLine();
		System.out.println("Enter the char to search in string : ");
		String searchString = sc.nextLine();
		
		Map<Character,Integer> charCountMap = new HashMap<Character,Integer>();
		testString = testString.replace(" ", "");
		char searchChar = searchString.charAt(0);
		char[] charArray = testString.toCharArray();
		for(char c : charArray)
		{
			if(charCountMap.containsKey(c))
			{
				charCountMap.put(c, charCountMap.get(c) +1);
			}
			else
			{
				charCountMap.put(c, 1);
			}
		}
		System.out.println("Occurence of Given Char "+ searchChar + " :" + charCountMap.get(searchChar));
	}
}
