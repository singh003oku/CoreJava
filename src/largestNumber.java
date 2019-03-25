package DemoFeb24;

import java.util.Scanner;

public class largestNumber {

	public static void main(String[] args) {

		int x, y, z;
		System.out.println("Enter three integers");
		Scanner in = new Scanner(System.in);
		System.out.println("Enter 1st Number");
		x = in.nextInt();
		System.out.println("Enter 2nd Number");
		y = in.nextInt();
		System.out.println("Enter 3rd Number");
		z = in.nextInt();
		
		if (x > y && x > z)
			System.out.println("First number is largest.");
		else if (y > x && y > z)
			System.out.println("Second number is largest.");
		else if (z > x && z > y)
			System.out.println("Third number is largest.");
		else
			System.out.println("The numbers are not distinct.");
	}

}
