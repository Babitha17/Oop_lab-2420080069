import java.util.Scanner;

public class volume {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int r;
		float pi=3.14f;
		double vol;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the radius:");
		r=sc.nextInt();
		vol=4/3*pi*r*r*r;
		System.out.println("Volume of sphere is:"+vol);
		

	}

}
