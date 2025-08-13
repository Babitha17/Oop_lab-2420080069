package Skill4;

public class Finalkeyworddemo {
final int AGE;
final StringBuilder data= new StringBuilder("Babitha");

Finalkeyworddemo(int age)
{
	AGE=age;
	
	
}
final void display()
{
	
	System.out.println("Age:"+AGE);
	System.out.println("String builder method name:" +data);
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Finalkeyworddemo f=new Finalkeyworddemo(18);
		
		//f.display();
		f.data.append("Gandikota");
		f.display();
		
		 
	}

}
