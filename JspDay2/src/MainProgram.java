import java.util.ArrayList;
import java.util.Iterator;

public class MainProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//job job1=new job(1, "HR");
		job job2=new job(2, "BA");
		job job3=new job(3, "Tester");
		job job4=new job(4, "Dev");
		job job5=new job(5, "CEO");
		Employee employee1=new Employee("Nguyen Van A", 1, 23, 24, true, new job(1, "HR"));
		Employee employee2=new Employee("Nguyen Van B", 2, 24, 25, false, job2);
		Employee employee3=new Employee("Nguyen Van C", 3, 25, 26, true, job3);
		Employee employee4=new Employee("Nguyen Van D", 4, 26, 27, false,job4);
		Employee employee5=new Employee("Nguyen Van E", 5, 27, 28, true,  job5);
		ArrayList<Employee> employees=new ArrayList<Employee>();
		employees.add(employee1);
		employees.add(employee2);
		employees.add(employee3);
		employees.add(employee4);
		employees.add(employee5);
		System.out.println("Mang co "+employees.size()+ " phan tu !");
		System.out.println("------------------Thong tin Emp-----------------");
		//in ra employee list bang for each
		for (Employee employee : employees) {
			System.out.println(employee.toString());
		}
		//in ra employee list bang iterator
		Iterator<Employee> itr=employees.iterator() ;
		while(itr.hasNext()) {
			Employee item=itr.next();
			System.out.println(item.toString());
		}
		
	}

}
