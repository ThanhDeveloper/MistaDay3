package lab1;
import java.util.*;
public class Operator {
	
	
	public static void main(String arg[]) {
		
			int a=3;
			int b=2;
			
			System.out.println("a+b= "+ a+b);
			System.out.println("a-b= "+ (a-b));
			System.out.println("a*b= "+ a*b);
			System.out.println("a/b= "+ a/b);
			System.out.println("a%b= "+ a%b);
			System.out.println("a++= "+ a++);
			System.out.println("b--= "+ (b--));
			/*if(a>b) {
				System.out.println("a>b");}
			else {System.out.println("a<b");
			}*/
			
			Scanner sc=new Scanner(System.in);
			String name=sc.nextLine();
			System.out.println("Name Employee :"+name);
			
		
	}
	public static  String Check(int a,int b) {
		return (a>b)?"a>b":"a<b";
	}

}
