package com.msjava.client;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class FindDuplicateChar {

	public static void main(String[] args)
	{
		Map<Character, Integer> charCountMap = new HashMap<Character, Integer>();
		System.out.println("Enter the test String : ");
		Scanner sc = new Scanner(System.in);
		String testString = sc.nextLine();
		
		testString = testString.replace(" ","");
		for(char c:testString.toCharArray())
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
		Set<Character> charKeySet = charCountMap.keySet();
		System.out.println("Duplicate Characters and counts :");
		for(Character ch :charKeySet)
		{
			if(charCountMap.get(ch) > 1)
			{
				System.out.println(ch + " : "+ charCountMap.get(ch));
			}
		}		
	}
}


