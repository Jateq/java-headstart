package practice1;

import java.util.Scanner;

public class Task4 {

	public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("Enter a: ");
			double a = scanner.nextDouble();

			System.out.print("Enter b: ");
			double b = scanner.nextDouble();

			System.out.print("Enter c: ");
			double c = scanner.nextDouble();

			double discriminant = b * b - 4 * a * c;

			if (discriminant < 0) {
			    System.out.println("Error: Discriminant is negative, roots are complex.");
			} else {
			    double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
			    double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
			    System.out.println("Root 1: " + root1);
			    System.out.println("Root 2: " + root2);
			}
		}
    }
	

}
