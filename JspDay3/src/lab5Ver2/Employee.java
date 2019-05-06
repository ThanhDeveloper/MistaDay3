package lab5Ver2;

public class Employee {
	private String name;
	private int id;
	private double salary;
	private int age;
	private boolean Married;
	private Job job;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public Employee() {
		super();
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public boolean isMarried() {
		return Married;
	}
	public void setMarried(boolean married) {
		Married = married;
	}
	public Job getJob() {
		return job;
	}
	public void setJob(Job job) {
		this.job = job;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + ", salary=" + salary + ", age=" + age + ", Married=" + Married
				+ ", jobID=" + job.idJob + ", jobName= "+job.nameJob+"]";
	}
	public Employee(String name, int id, double salary, int age, boolean married, Job job) {
		super();
		this.name = name;
		this.id = id;
		this.salary = salary;
		this.age = age;
		Married = married;
		this.job = job;
	}
	
	
}
