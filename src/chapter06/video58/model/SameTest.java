package chapter06.video58.model;

public class SameTest {
	public static void main(String[] args) {
		Employee nv1 = new Employee();
//		nv1.name = "hoidanit"; // private => inside class
		nv1.age = 25; // default => same package
		nv1.salary = 123;
	}
}
