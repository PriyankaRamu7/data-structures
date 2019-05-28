package com.example.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;



public class IntegerPuzzle {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.stream(new int[] {7, 14, 68}).boxed().collect(Collectors.toList());
		List<Integer> result = new ArrayList<>();
		for(Integer i : list) {
			int sum = 0; 
			int integer = i.intValue();
			sum = getSum(sum, integer);
			if((sum/10)>0) {
				sum = getSum(0, sum);
			}
			result.add(sum);
		}
		System.out.println("Result : " + result);
	}

	private static int getSum(int sum, int integer) {
		while(integer > 0) {
			sum = sum + (integer%10) ;
			integer = integer/10;
		}
		return sum;
	}
}
