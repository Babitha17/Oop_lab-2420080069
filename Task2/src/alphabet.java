import java.util.Scanner;
public class alphabet {
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		
		 System.out.println("enter a character");
	 
	     char ch =sc.next().charAt(0);
	     if(ch>='A' && ch<='Z'||ch>='a' && ch<='z' ) {
	    	 System.out.println("It is alphabet" +ch);
	     }else {
	    	 System.out.println("It is not an alphabet" +ch);
	    	 
	     }
	     }
	     

}
