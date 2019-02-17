package arrays.basic_problems;

import java.util.Scanner;

public class Issue002 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("enter array dimension:");
		int dimension = scanner.nextInt();
		if (dimension <= 0 || dimension > 100) {
			System.out.println("error: invalid dimension entered!");
			scanner.close();
			
			return;
		}
		
		System.out.println("enter array elements:");
		int[] array = new int[dimension];
		for (int i = 0; i < array.length; i++) {
			array[i] = scanner.nextInt();
		}
		
		printArrayElementsAtEvenIndex(array);
		printEvenArrayElements(array);
		
		scanner.close();
	}
	
	private static void printArrayElementsAtEvenIndex (int[] array) {
		System.out.println("array elements at even idex position:");
		for (int i = 0; i < array.length; i += 2) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}
	
	private static void printEvenArrayElements (int[] array) {
		System.out.println("even array elements:");
		for (int i = 0; i < array.length; i++) {
			if (array[i] % 2 == 0) {
				System.out.print(array[i] + " ");
			}
		}
		System.out.println();
	}

}
