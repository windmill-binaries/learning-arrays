package arrays.basic_problems;

import java.util.Scanner;

public class Issue018 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("enter number of elements in the array:");
		int dimension = scanner.nextInt();
		if (dimension <= 0 || dimension > 100) {
			System.out.println("error: invalid array dimensio entered!");
			scanner.close();
			
			return;
		}
		
		System.out.println("enter array elements:");
		int[] array = new int[dimension];
		for (int i = 0; i < array.length; i++) {
			array[i] = scanner.nextInt();
		}
		
		System.out.println(min_max(array));
		
		scanner.close();
	}
	
	private static int min_max (int[] array) {
		int result = -1;
		
		int minIndex = 0;
		int maxIndex = 0;
		
		for (int i = 1; i < array.length; i++) {
			if (array[i] < array[minIndex]) {
				minIndex = i;
			}
			if (array[i] > array[maxIndex]) {
				maxIndex = i;
			}
		}
		
		result = Math.min(minIndex, maxIndex);
		
		return result;
	}

}
