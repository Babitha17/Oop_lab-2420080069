import java.util.Scanner;
public class farhenheit {
	 public static void main(String[] args) {
	
	   

	    Scanner sc = new Scanner(System.in);
	    System.out.println("Enter temperature in Fahrenheit:");
	    float farhenheit=sc.nextInt();
	    
	    float celsius = (farhenheit - 32) * (5.0f/ 9.0f);

	    System.out.println("Celsius to farhenheit is:"+celsius);
	    }
	

	

}
