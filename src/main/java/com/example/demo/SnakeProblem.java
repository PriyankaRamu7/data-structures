package com.example.demo;

public class SnakeProblem {

	public static void main(String[] args) {
		int n = 4;
		int m;
		
		for(int i =0; i<n; i++) {
			if (i == 0) {
				m = 1;
			} else {
				m = (n + 3 * (n - 1)) - i;
			}
			for(int j=0; j<n; j++) {
				
				System.out.printf(m + " ");
				m++;
				
			}
			System.out.printf("\n");
		}
	}
}
