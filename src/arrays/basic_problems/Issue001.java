package arrays.basic_problems;

import java.util.Scanner;

public class Issue001 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("enter vector dimension:");
		int dimension = scanner.nextInt();
		if (dimension <= 0 || dimension > 100) {
			System.out.println("error: invalid dimension entered!");
			scanner.close();
			
			return;
		}
		
		System.out.println("enter coordinates for vector a:");
		int[] a = new int[dimension];
		for (int i = 0; i < a.length; i++) {
			a[i] = scanner.nextInt();
		}
		
		System.out.println("enter coordinates for vector b:");
		int[] b = new int[dimension];
		for (int i = 0; i < b.length; i++) {
			b[i] = scanner.nextInt();
		}
		
		System.out.println("scalar product of vectors a and b:");
		System.out.println(scalarProduct(a, b));
		
		scanner.close();
	}
	
	private static int scalarProduct (int[] a, int[] b) {
		int result = 0;
		
		for (int i = 0; i < a.length; i++) {
			result += a[i] * b[i];
		}
		
		return result;
	}

}
