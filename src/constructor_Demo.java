package DemoPakage;

public class constructor_Demo {

	public constructor_Demo() {

		System.out.println("with out parameter constructor ");

	}

	public constructor_Demo(int a) {

		System.out.println("with one parameter constructor i.e " + a);

	}

	public constructor_Demo(int a, int b) {

		System.out.println(" constructor with sum of two values " + (a + b));

	}

	public static void main(String[] args) {

		constructor_Demo obj = new constructor_Demo();
		constructor_Demo obj1 = new constructor_Demo(5);

	}

}
