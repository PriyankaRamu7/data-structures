package com.example.demo;

import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ArraysEx {

	public static void main(String arr[]) {
		Integer[] arr1 = {1,2,3};
		Integer[] arr2 = {1,2,3};
		
		String[] str = new String[] {"a", "b", "c"};
		String[] strArr = new String[12];
		String[][] twoDimen = new String[3][3];
		String[][] twoDimen1 = new String[][] {{"a", "b"},{"c", "d"}};
		
		for(int i=0; i<twoDimen1.length; i++) {
			for(int j=0;j<twoDimen1.length; j++) {
				System.out.printf(twoDimen1[i][j]);
				System.out.printf("\t");
			}
			System.out.println("\n");
		}
		
		System.out.println(Arrays.deepEquals(arr1, arr2));
		System.out.println(Arrays.equals(arr1, arr2));
		System.out.println(arr1.hashCode() + "  " + arr2.hashCode());
		
		System.out.println("Enter the number to be scanned");
		
		Scanner inputReader = new Scanner(System.in);
		int input = inputReader.nextInt();
		System.out.println("Enter the element to be searched");
		int search = inputReader.nextInt();
		
		char[] chArr = new Integer(input).toString().toCharArray();
		int[] intArr = new int[chArr.length];
		for(int i=0; i<chArr.length; i++) {
			intArr[i] = Character.getNumericValue(chArr[i]);
		}
		List<Integer> listInt = Arrays.stream(intArr).boxed().collect(Collectors.toList());
		int count = listInt.stream().filter(i -> i==search).collect(Collectors.toList()).size();
		System.out.println("No of Occurances : " + count);
	}
}
