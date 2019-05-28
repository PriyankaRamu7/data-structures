package com.example.demo;

public class AliceStringProblem {

	public static void main(String[] args) {
		int tc= 2;
		int len = 3;
		String x = "xyz";
		String y = "aaa";
	
		String alphabet = "abcdefghijklmnopqrstuvwxyz";
		int sum = 0;
		for(int i=0; i<x.length(); i++) {
			sum = sum + (alphabet.indexOf(x.charAt(i)) + alphabet.indexOf(y.charAt(i)));
		}
		System.out.println(sum);
	}
	
	public void aliceStringProblem() {
		System.out.println("Third Commit");
		System.out.println("Fourth Commit added");
	}
}
