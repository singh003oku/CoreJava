package CoreJava;

public class ParameterOfMethods {

	public static void main(String[] args) {
		ParameterOfMethods obj = new ParameterOfMethods();
		obj.Sum(10, 25);
		obj.Mul(10, 20, 30);
	}

	public void Sum(int a, int b) {
		int Sum;
		Sum = a + b;
		System.out.println("Sum of two number :" + Sum);

	}

	public void Mul(int a, int b ,int c) {

		int Mul;
		Mul = a*b*c;
		System.out.println("Mul of  number :" + Mul);

	}

}
