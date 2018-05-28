package com.msjava.client;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountOccurrencesOfEachCharacter {

	public static void main(String[] args) {
		System.out.println("Enter the string :");
		Scanner input = new Scanner(System.in);
		String str = input.next();

		Map<Character, Integer> charCountMap = new HashMap<Character, Integer>();
		str = str.replace(" ", "");
		char[] charArray = str.toCharArray();
		for (char c : charArray) 
		{
			if (charCountMap.containsKey(c)) 
			{
				charCountMap.put(c, charCountMap.get(c) + 1);
			} else 
			{
				charCountMap.put(c, 1);
			}
		}
		System.out.println("Count char : " + charCountMap);
	}
}
