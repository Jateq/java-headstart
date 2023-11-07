package practice1;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Welcome! This program will calculate area, perimeter, and lenght of diagonal of square");
			
			System.out.println("Enter the length 'a' of a square: ");
			String userInput = scanner.nextLine();
			int length = Integer.parseInt(userInput);
			int area = length * length;
			int perimeter = length * 4;
			double diagonal = Math.sqrt(length * length + length * length);
			System.out.println("Area is: " +area);
			System.out.println("Perimeter is: " +perimeter);
			System.out.println("Length of diagonal is: " +diagonal);
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}
        

	}

}
