package MAIN;

import BankAccount.*;

public class harrisHw4 {

	public static void main(String[] args) {
		BankAccount B1 = new BankAccount("Johnson", "Bobby", "123456", 2390.00, 3400.00, .02);
		BankAccount B2 = new BankAccount("Thomas", "Richard", "654888", 5360.00, 5400.00, .0025);
		BankAccount B3 = new BankAccount("Turner", "James", "622898", 360.00, 5400.00, .0021);
		
		//Task 1
		System.out.println();
		System.out.println();
		System.out.println("Task 1");
		B1.depositToChecking(100.32);
		System.out.println();
		//Task 2
		System.out.println();
		System.out.println("Task 2");
		B1.depositToSavings(2000.00);
		System.out.println();
		//Task 3
		System.out.println();
		System.out.println("Task 3");
		B1.withdrawFromCheckings(90.00);
		System.out.println();
		//Task 4
		System.out.println();
		System.out.println("Task 4");
		B1.displayAccounting();
		System.out.println();
		//Task 5
		System.out.println();
		System.out.println("Task 5");
		B2.depositToChecking(1230.02);
		System.out.println();
		//Task 6
		System.out.println();
		System.out.println("Task 6");
		B2.depositToSavings(1000.00);
		System.out.println();
		//Task 7
		System.out.println();
		System.out.println("Task 7");
		B2.withdrawFromSavings(765.00);
		System.out.println();
		//Task 8
		System.out.println();
		System.out.println("Task 8");
		B2.displayAccounting();
		System.out.println();
		//Task 9
		System.out.println();
		System.out.println("Task 9");
		B3.displayAccounting();
		System.out.println();
		
	}

}
