package DemoFeb24;

import java.util.Scanner;

public class PerimeterOfCircle {

	public static void main(String[] args) {
		 double radius;
	        Scanner sc=new Scanner(System.in);
	         
	         // input radius of circle
	        System.out.print("Enter the Radius of Circle : ");
	        radius=sc.nextDouble(); 
	         
	        // circle parameter is 2 * pie * radius 
	        double Perimeter=2*3.14*radius;
	         
	        System.out.print("Perimeter of Circle : " + Perimeter);
	}

}
