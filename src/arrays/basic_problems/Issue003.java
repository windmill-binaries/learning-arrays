package arrays.basic_problems;

import java.util.Scanner;

public class Issue003 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("enter integer value:");
		int number = scanner.nextInt();
		int original = number;
		int[] histogram = new int[10];
		
		if (number < 0) {
			number = Math.abs(number);
		}
		
		while (number != 0) {
			histogram[number % 10]++;
			number /= 10;
		}
		
		for (int i = 0; i < histogram.length; i++) {
			if (histogram[i] > 0) {
				System.out.println("in  number " + original + " digit " + i + " is occurring " + histogram[i] + " times");
			}
		}
		
		scanner.close();
	}

}
