package lab5Ver2;

import java.util.*;

public class ListManagement implements AbstractManagermentEmployee {
	public static int inputNumber;
	public static Scanner input = new Scanner(System.in);
	ArrayList<Employee> empArr=new ArrayList<>();
	public static int empNo;
	public static boolean isEndProgram = false;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		showMenu();
	
	}
	
	private static void showMenu() {
		//Create list Emp Collection
		
		
		//LinkedList<Employee> employees=new LinkedList<>();
		ListManagement list=new ListManagement();
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
				//addEmployees();
				
				//using interface 
				
				list.addEmp();
				askForContinues();
				break;
			case 2: // Show employ

				//showEmployees();
				list.showEmp();
				askForContinues();
				break;
			case 3: // Find employ
				System.out.println("Input name to search! ");
				String nameInp = input.next();
				Employee employee = list.findEmp(nameInp);
				System.out.println("Infor Emp");
				System.out.println(employee);
				String fullname = "Nguyen Tam Thanh";
				 if(fullname.toLowerCase().contains(nameInp.toLowerCase())) {
					 System.out.println("ok");
				 }
				 
				 
				 
				askForContinues();
				break;
			case 4: // Edit employ
				System.out.println("Update name and salary");
				String nameUp = input.next();
				double salaryUp = input.nextDouble();
				//UpdateEmployees(nameUp, salaryUp);
				list.updateEmp(nameUp,salaryUp);
				System.out.println();
				askForContinues();
			case 5:
				break;
			default:
				System.out.println(" Your input wrong,Enter again! ");
				break;
			}
		} while (inputNumber != 5);

	}
	
	/* 
	// This is out source code
	// UpdateEmp
	private static void UpdateEmployees(String nameUp, double salaryUp) {
		
		
		 * update with id double salary = input.nextDouble(); Integer upChoice =
		 * input.nextInt(); String name = input.next(); Integer age = input.nextInt();
		 * String jobName = input.next(); boolean Married = input.nextBoolean();
		 * empArr[upChoice - 1].setName(name); empArr[upChoice - 1].setSalary(salary);
		 * empArr[upChoice - 1].setAge(age); empArr[upChoice - 1].setJob(new
		 * Job(upChoice - 1, jobName)); empArr[upChoice - 1].setMarried(Married);
		 * 
		 * 
		 * //update with name and salary String nameInput=input.next(); double
		 * salaryInput=input.nextDouble(); for (int i = 0; i < empArr.length; i++) {
		 * if(nameInput.equals(empArr[i].getName())) { empArr[i].setSalary(salaryInput);
		 * } }
		 
		System.out.println("Enter name and salary employ to update ! ");
		for (int i = 0; i < ; i++) {
			if (nameUp.equals(empArr[i].getName())) {
				empArr[i].setSalary(salaryUp);
				break;
			}
		}

	}
	 
	// FindEmp
	private static Employee FindEmployees(String nameInp) {

		/*
		 * System.out.println("Find with name"); String findName=input.next(); Integer
		 * findChoice = input.nextInt(); // Check and find arrObject // Check with id if
		 * (findChoice > empArr.length) { System.out.println("No id existed"); } else {
		 * System.out.println(empArr[findChoice - 1]); }
		 * 
		 * // check with name (RegexInput) for (int i = 0; i < empArr.length; i++) {
		 * if(findName.equals(empArr[i].getName())) {
		 * System.out.println(empArr[i].toString()); }
		 * 
		 * 
		 * }
		 

		// other solution
		Employee employee = null;
		for (int i = 0; i < empArr.length; i++) {
			if (nameInp.equals(empArr[i].getName())) {
				employee = empArr[i];
				break;
			}
		}
		return employee;
	}

	// ShowEmp
	private static void showEmployees() {

		for (int i = 0; i < empArr.length; i++) {
			System.out.println(empArr[i].toString());
		}
	}
	
	/*
	// AddEmp
	private static void addEmployees() {
		System.out.println("How many do you want to Create?");
		empNo = input.nextInt();
		empArr = new Employee[empNo]; // create size ObjectArray
		// input data
		for (int i = 0; i < empArr.length; i++) {
			System.out.println("Name emp: ");
			String name = input.next();
			System.out.println("salary emp: ");
			double salary = input.nextDouble();
			System.out.println("Age emp: ");
			Integer age = input.nextInt();
			System.out.println("jobName emp: ");
			String jobName = input.next();
			System.out.println("Married emp: ");
			boolean Married = input.nextBoolean();
			Employee empObj = new Employee(name, i + 1, salary, age, Married, new Job(i + 1, jobName));
			empArr[i] = empObj;

		}

	}
*/
	//askForContinues
	public static void askForContinues() {
		System.out.println("Do you want to continue? (Press 5 to end proram, 0 to come back menu) : ");
		int inputNo = input.nextInt();
		switch (inputNo) {
		case 0:
			showMenu();
			break;
		case 5:
			isEndProgram = true;
			break;
		default:
			break;
		}

	}
//@Overide methods AbstractManagement using collection (Arraylist)

	@Override
	public void addEmp() {
		// TODO Auto-generated method stub
		System.out.println("How many do you want to Create?");
		empNo = input.nextInt();
		for (int i = 0; i < empNo; i++) {
			System.out.println("Name emp: ");
			String name = input.next();
			System.out.println("salary emp: ");
			double salary = input.nextDouble();
			System.out.println("Age emp: ");
			Integer age = input.nextInt();
			System.out.println("jobName emp: ");
			String jobName = input.next();
			System.out.println("Married emp: ");
			boolean Married = input.nextBoolean();
			Employee empObj = new Employee(name, i + 1, salary, age, Married, new Job(i + 1, jobName));
			empArr.add(empObj);

		}
	}

	@Override
	public void updateEmp(String nameUp, double salaryUp) {
		// TODO Auto-generated method stub
		System.out.println("Enter name and salary employ to update ! ");
		for (Employee employee : empArr) {
			if(nameUp.equals(employee.getName())){
				employee.setSalary(salaryUp);
			}
		}
	}

	@Override
	public Employee findEmp(String nameInp) {
		// find list through index
		
		Employee employee = null;
		for (int i = 0; i < empArr.size(); i++) {
			if(nameInp.equals(empArr.get(i).getName())) {
				employee=empArr.get(i);
				break;
			}
		}
		
		return employee;
	}

	@Override
	public void showEmp() {
		
		
		for (Employee employee : empArr) {
			System.out.println(employee.toString());
		}
		
	}
	
}
