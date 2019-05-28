package com.example.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;



public class java8Streams {

	public static void main(String[] args) {
		List<Map> listMap = new ArrayList<>();
		Map<String, String> map1 = new HashMap<>();
		Map<String, String> map2 = new HashMap<>();
		map1.put("key1", "value1");
		map1.put("key2", "value2");
		map2.put("key1", "value3");
		map2.put("key2", "value4");
		listMap.add(map1);
		listMap.add(map2);
		System.out.println("Before remove" + listMap);
		Iterator itr = listMap.iterator();
		while(itr.hasNext()) {
			itr.next();
			itr.remove();
		}
		System.out.println("After remove" + listMap);
		Map<String, Object> finalMap = listMap.stream().collect(Collectors.toMap(map -> 
		(String)((Map.Entry)(((Map)map).entrySet().stream().findFirst().get())).getValue()
		, map -> map));
		System.out.println("Map of Maps " + finalMap);
		System.out.println(map1.hashCode());
		
		List<String> l11 = Arrays.asList("a","b");
		callMethod(l11);
		System.out.println(l11);
	}
	
	public static void callMethod(List l1 ) {
		System.out.println(l1.hashCode());
		//l1.add("c"); 
	}
<<<<<<< Updated upstream
	
	public void example() {
		System.out.println("Second commit");
=======

	public void javaStreams() {
		System.out.println("Third Commit");
>>>>>>> Stashed changes
	}
}
