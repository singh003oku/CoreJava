package DemoPakage;

public class OverLoading {

	void Add(int a, int b) {

		System.out.println("Sum of Values :" + (a + b));
	}

	void Add(int a, int b, int c) {

		System.out.println("Sum of Values :" + (a + b + c));

	}

	void Add(int a, int b, Float c) {

		System.out.println("Sum of Values :" + (a + b + c));
	}

	public static void main(String[] args) {

		OverLoading obj = new OverLoading();
		obj.Add(10, 20);
		obj.Add(10, 20, 30);
		obj.Add(10, 20, 20.1f);
	}

}
