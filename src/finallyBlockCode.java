package DemoPakage;

public class finallyBlockCode {

	public static void main(String[] args) {
		int a = 10;
		try {

			System.out.println(a / 2);

		} catch (Exception e) {

			System.out.println(e);
		} finally {
			System.out.println("we are into finally");
		}


	}

}
