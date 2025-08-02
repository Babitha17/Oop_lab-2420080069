import java.util.Scanner;
public class vowel {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the alphabet\t");
    char ch=sc.next().charAt(0);
    if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U') {
      System.out.print("It is a Vowel\t");
   }
    else {
     System.out.print("It is a constant\t");
   }

  }

}
