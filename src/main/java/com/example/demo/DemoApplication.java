package com.example.demo;

import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

import java.util.Arrays;

public class DemoApplication {

	public static void main(String[] args) {
		String[] arr = { "a", "b" , "c" };
		List<String> ls = Arrays.asList(arr).stream().map(p -> (String)p).collect(Collectors.toList());
		
		Iterator itr = ls.iterator();
		
		while(itr.hasNext()) {
			if(itr.next().equals("a")) {
				itr.remove();
			}
		}
		System.out.println(ls);
	}

}

