package chapter06.lab04.model;

public class Employee {
	private String name;
	private int age;
	private String department;
	private double salary;
//	private String company = "viettel";
	private String company;

	public Employee(String name, int age, String department, double salary) {
		this.name = name;
		this.age = age;
		this.department = department;
		this.salary = salary;
		this.company = "fb";
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getAge() {
		return age;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getDepartment() {
		return department;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public double getSalary() {
		return salary;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getCompany() {
		return company;
	}

	public void showInfo() {
		System.out.println("Name: " + this.getName());
		System.out.println("Age: " + this.getAge());
		System.out.println("Department: " + this.getDepartment());
		System.out.println("Salary: " + this.getSalary());
		System.out.println("Company: " + this.getCompany());
	}

	public void raiseSalary(double amount) {
		if (amount > 0) {
			double curentSalary = this.getSalary();
			double futureSalary = curentSalary * 1.15;
			this.setSalary(futureSalary);
		}
	}
}
