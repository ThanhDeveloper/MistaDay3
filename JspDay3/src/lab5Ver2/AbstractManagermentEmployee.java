package lab5Ver2;

public interface AbstractManagermentEmployee {
	public void addEmp();
	public void updateEmp(String name,double salaryUp);
	public Employee findEmp(String emp);
	public void showEmp();
}
