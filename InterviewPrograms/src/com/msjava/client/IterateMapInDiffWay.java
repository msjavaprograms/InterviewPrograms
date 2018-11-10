package com.msjava.client;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class IterateMapInDiffWay {

	public static void main( String args[] )
	{
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("Apple", 100);
		map.put("Orange", 200);
		map.put("Mangos", 300);
		
		// Method 1. Iterate through entryset, Set and forEach loop
		Set<Map.Entry<String, Integer>> mapEntrySet = map.entrySet();
		System.out.println("1.Iterate through entryset, Set and forEach loop");
		System.out.println("******************************************");
		for (Entry<String, Integer> entry : mapEntrySet)
		{
			System.out.println("Map key and values : " + entry.getKey() + " "
					+ entry.getValue());
		}

		// Method 2. Iterate through entryset, Set and while loop
		Set<Map.Entry<String, Integer>> x = map.entrySet();
		Iterator<Entry<String, Integer>> iterator = x.iterator();
		System.out.println("2.Iterate through entryset, Set and while loop");
		System.out.println("******************************************");
		while (iterator.hasNext())
		{
			Entry<String, Integer> next = iterator.next();
			System.out.println("Map key and values : " + next.getKey() + " "
					+ next.getValue());

		}

		// Method 3. Iterate through entryset, Iterator and while loop 
		// Method 2 and Method 3 and almost similar
		Iterator<Map.Entry<String, Integer>> mapIterator = map.entrySet()
				.iterator();
		System.out.println("3.Iterate through entryset, Iterator and while loop");
		System.out.println("******************************************");
		while (mapIterator.hasNext())
		{
			Entry<String, Integer> mapItr = mapIterator.next();
			System.out.println("Map key and values : " + mapItr.getKey() + " "
					+ mapItr.getValue());
		}

		// Method 4. Iterating over keys and searching for values
		System.out.println("4.Iterating over keys and searching for values");
		System.out.println("******************************************");
		for (String key : map.keySet())
		{
			Integer value = map.get(key);
			System.out.println("Map key and values : " + key + " " + value);
		}
	}
}














