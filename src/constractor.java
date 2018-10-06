package DemoPakage;

public class constractor {

	constractor(){
		
		System.out.println("You are into non parameter constractor");
		
	}
	
	constractor(int a , int b)
	{
		System.out.println("you are into Paramerter constractor"+(a+b));
		
	}
	
	public static void main(String[] args) {
		constractor obj= new constractor();
		constractor obj1= new constractor(5 , 10);
		
		
	}

}
