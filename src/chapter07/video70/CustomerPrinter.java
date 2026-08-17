package chapter07.video70;

public class CustomerPrinter {
	public void print(String name) {
		System.out.println("Name = " + name);
	}

	public void print(String name, int age) {
		System.out.println("Name = " + name + " and " + age);
	}

	public void print(String name, int age, String city) {
		System.out.println("Name = " + name + " and " + age + " and " + city);
	}
}