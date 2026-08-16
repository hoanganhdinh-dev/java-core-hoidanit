package chapter07.video68;

public class Video68 {
	public static void main(String[] args) {
		Manager boss = new Manager("IT", "Eric", 123, 1000);
		Programmer dev = new Programmer("hoidanit", 456, 1000);

		System.out.println("Boss salary: " + boss.calculateSalary());
		System.out.println("Dev salary: " + dev.calculateSalary());
	}
}