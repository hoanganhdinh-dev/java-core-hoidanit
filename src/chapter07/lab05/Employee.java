package chapter07.lab05;

public class Employee extends Person {
	private String employeeId;
	private double salary;

	public Employee(String name, int age, String employeeId, double salary) {
		super(name, age);
		this.employeeId = employeeId;
		this.salary = salary;
	}

	public String getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public void introduce() {
		super.introduce();
		System.out.println("EmployeeId: " + this.employeeId);
		System.out.println("Salary: " + this.salary);
	}

	public double calculateSalary() {
		return this.salary;
	}

	public double calculateSalary(double bonus) {
		return this.salary + bonus;
	}
}