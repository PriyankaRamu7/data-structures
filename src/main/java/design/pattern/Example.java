package design.pattern;

import java.util.Scanner;

public class Example {

	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int loop = scanner.nextInt();
		if(loop > 0) {
			int size = scanner.nextInt();
			String searchStr = scanner.nextLine();
		System.out.println("Output " + loop + size + searchStr);
		}
	}
}

/*2 
5 16
9 7 2 16 4
7 98
1 22 57 47 34 18 66*/