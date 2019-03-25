package DemoFeb24;

import java.util.Scanner;

public class FactorialOftheNumber {

	public static void main(String[] args) {

		int i, fact = 1, number;
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the number for factorial");
		number = sc.nextInt();

		for (i = 1; i <= number; i++) {
			fact = fact * i;
		}

		System.out.println("Factorial of " + number + " is: " + fact);

	}

}
