package ADM;

import com.sun.org.apache.xerces.internal.util.SynchronizedSymbolTable;

public class GrdaeSystem {

	public static void main(String[] args) {

		int percentage=20;
		
		if(percentage>=80){
	         System.out.println("Grade-  A");
	      }else if(percentage>=60 && percentage<80){
	         System.out.println("Grade- B ");
	      }
	      else if(percentage>=40 && percentage<60){
	        System.out.println("Grade- C ");
	      }
	      else {
	        System.out.println("Grade -D");
	      }
		
	}

}
