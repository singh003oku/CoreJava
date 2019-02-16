package TestPackage;

import java.util.Scanner;

public class TestInterfaceClass implements TestInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestInterfaceClass obj = new TestInterfaceClass();
		obj.Add();
	}

	@Override
	public void Add() {
		Scanner sc = new Scanner(System.in);
		int a, b;
		System.out.println("enter 1st number");
		a = sc.nextInt();
		b = sc.nextInt();
		System.out.println("Sum of two number :" + (a + b));

	}

		@Override
	public void mul() {
		// TODO Auto-generated method stub

	}




		@Override
		public void Sub() {
			// TODO Auto-generated method stub
			
		}

}
