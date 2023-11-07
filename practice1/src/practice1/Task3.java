package practice1;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Do you want to know your grade?");
			System.out.println("Type your points out of 100: ");
			String userInput = scanner.nextLine();
			int grade = Integer.parseInt(userInput);
			
			if(grade >= 95 && grade <= 100) {
				System.out.println("Congratulations, your grade is: A | 4.00");
			} else if(grade >= 90 && grade <= 94) {
				System.out.println("Congratulations, your grade is: A- | 3.67");
			} else if(grade >= 85 && grade <= 89) {
				System.out.println("Congratulations, your grade is: B+ | 3.33");
			} else if(grade >= 80 && grade <= 84) {
				System.out.println("Congratulations, your grade is: B | 3.00");
			} else if(grade >= 75 && grade <= 79) {
				System.out.println("Congratulations, your grade is: B- | 2.67");
			} else if(grade >= 70 && grade <= 74) {
				System.out.println("Satisfactory, your grade is: C+ | 2.33");
			} else if(grade >= 65 && grade <= 69) {
				System.out.println("Satisfactory, your grade is: C | 2.00");
			} else if(grade >= 60 && grade <= 64) {
				System.out.println("Satisfactory, your grade is: C- | 1.67");
			} else if(grade >= 55 && grade <= 59) {
				System.out.println("Satisfactory, your grade is: D+ | 1.33");
			} else if(grade >= 50 && grade <= 54) {
				System.out.println("Satisfactory, your grade is: D | 1.00");
			} else if(grade < 49) {
				System.out.println("You failed: F | 0.00");
			} else if(grade > 100) {
				System.out.println("Enter a number less than 100");
			} else {
				System.out.println("Died....");
			}
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}
		

	}

}
