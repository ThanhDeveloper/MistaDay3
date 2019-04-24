package lab5Ver2;

import java.util.*;

public class ListManagement {
	public static int inputNumber;
	public static Scanner input = new Scanner(System.in);
	public static Employee[] empArr;
	public static int empNo;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		showMenu();
		System.out.println("The Program end !!! ");
	}

	private static void showMenu() {

		do {
			// menu CodeTodo

			System.out.println("1: Create  new Employees");
			System.out.println("2: Show the existing Employees");
			System.out.println("3: find the existing Employees");
			System.out.println("4: Update the existing Employees");
			System.out.println("5: exit");
			System.out.println("--------------------------------------");
			System.out.println("Choose one number !");
			inputNumber = input.nextInt();

			switch (inputNumber) {
			case 1: // add employ
				addEmployees();
				break;
			case 2: // Show employ

				showEmployees();
				break;
			case 3: // Find employ
				FindEmployees();
				break;
			case 4: // Edit employ
				UpdateEmployees();
			case 5:
				break;
			default:
				System.out.println(" Your input wrong,Enter again! ");
				break;
			}
		} while (inputNumber != 5);

	}

	// UpdateEmp
	private static void UpdateEmployees() {
		System.out.println("Enter name and salary employ to update ! ");
		/*update with id
		double salary = input.nextDouble();
		Integer upChoice = input.nextInt();
		String name = input.next();
		Integer age = input.nextInt();
		String jobName = input.next();
		boolean Married = input.nextBoolean();
		empArr[upChoice - 1].setName(name);
		empArr[upChoice - 1].setSalary(salary);
		empArr[upChoice - 1].setAge(age);
		empArr[upChoice - 1].setJob(new Job(upChoice - 1, jobName));
		empArr[upChoice - 1].setMarried(Married);
		 */
		
		//update with name and salary
		String nameInput=input.next();
		double salaryInput=input.nextDouble();
		for (int i = 0; i < empArr.length; i++) {
			if(nameInput.equals(empArr[i].getName())) {
				empArr[i].setSalary(salaryInput);
			}
		}
		
	}

	// FindEmp
	private static void FindEmployees() {

		System.out.println("Find with name");
		String findName=input.next();
/*		Integer findChoice = input.nextInt();
		// Check and find arrObject
		// Check with id
		if (findChoice > empArr.length) {
			System.out.println("No id existed");
		} else {
			System.out.println(empArr[findChoice - 1]);
		}
		*/
		// check with name (RegexInput)
		for (int i = 0; i < empArr.length; i++) {
			if(findName.equals(empArr[i].getName())) {
				System.out.println(empArr[i].toString());
			}
			
			
		}
		
		
	}

	// ShowEmp
	private static void showEmployees() {

		for (int i = 0; i < empArr.length; i++) {
			System.out.println(empArr[i].toString());
		}
	}

	// AddEmp
	private static void addEmployees() {

		System.out.println("How many do you want to Create?");
		empNo = input.nextInt();
		empArr = new Employee[empNo]; // create size ObjectArray
		// input data
		for (int i = 0; i < empArr.length; i++) {
			String name = input.next();
			double salary = input.nextDouble();
			Integer age = input.nextInt();
			String jobName = input.next();
			boolean Married = input.nextBoolean();
			Employee empObj = new Employee(name, i + 1, salary, age, Married, new Job(i + 1, jobName));
			empArr[i] = empObj;

		}

	}

}
