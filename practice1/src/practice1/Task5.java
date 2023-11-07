package practice1;

import java.util.Scanner;

public class Task5 {
	    public static void main(String[] args) {
	        double interestRate = 0.05; 
	        System.out.println("This program adds interest in 5% to your saving account  ");
	        try (Scanner scanner = new Scanner(System.in)) {
	        	System.out.print("Enter your balance: ");
	        	double Balance = scanner.nextDouble();
	        	System.out.print("Enter the number of years: ");
				int years = scanner.nextInt();

				for (int i = 1; i <= years; i++) {
					Balance = Balance + (Balance * interestRate);
					System.out.println("New balance after "+i+ " years is " +Balance);
				}
			}
	    }
	}


