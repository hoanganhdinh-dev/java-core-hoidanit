package chapter07.video65;

public class Student extends Person {
	String school;

	public Student(String school, String name, int age) {
//		super(); //	Sử dụng khi không có hàm tạo và phải khởi tạo đầu tiên.
		super(name, age);
		this.school = school;
	}

	public void printInfo() {
		System.out.println("Student: " + this.school);
	}

	public void test() {
		this.printInfo();
		super.printInfo();
	}
}
