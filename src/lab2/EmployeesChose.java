package lab2;
import java.util.Scanner;
public class EmployeesChose {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Choose numbers");
		System.out.println("1: Create a new Employees");
		System.out.println("2: Show the existing Employees");
		System.out.println("3: exit");
		String emp1="Long";

		Scanner sc=new Scanner(System.in);
		int chose=sc.nextInt();
		
		switch (chose) {
		case 1:
		
			System.out.print("Enter name: ");
			String empx=sc.next();
			System.out.println("New Emp is : "+empx);
		
		break;
		case 2:
			System.out.println(emp1);
			break;
		case 3:
	
			break;
		
		}
		
	}

}
