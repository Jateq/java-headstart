package task1;

import java.util.Scanner;

public class Analyzer {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
		 
		 Data data = new Data();
		 
		 while(true) {
			 System.out.print("Enter number (Q to quit): ");
			 String userInput = scanner.nextLine();
			 
			 if(userInput.equals("Q")) {
				 System.out.println(data.getAvg());
				 System.out.println(data.getMax());
				 break;
			 }
			 double val = Double.valueOf(userInput);
			 data.addValue(val);
			 
		 }
	}

}
