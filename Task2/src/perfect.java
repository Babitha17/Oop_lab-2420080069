import java.util.Scanner;
public class perfect {

	public static void main(String[] args) {
		
		        Scanner sc = new Scanner(System.in);
		  
		        System.out.println("Enter a number: ");
		        int num = sc.nextInt();
		        int sum = 0;
		        for(int i=1;i<num;i++) {
		        	if(num %i ==0) {
		        		sum=sum+i;
		        	
		        	}	 	
		        }
		        if(sum==num) {
		        	 System.out.println("is a perfect number"+ num);
		        }else {
		        	System.out.println("is not a perfect number" + num);
		        }
		        }
}

		        
		        