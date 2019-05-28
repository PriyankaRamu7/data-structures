package com.example.demo;

import java.util.ArrayList;
import java.util.List;

public class MemorizeMe {

	public static void main(String[] args) {
		List<Integer> intList = new ArrayList<>();
		intList.add(1);
		intList.add(2);
		intList.add(3);
		System.out.println(intList);
		intList.forEach(i -> i++);
		System.out.println(intList);
	}

}
 