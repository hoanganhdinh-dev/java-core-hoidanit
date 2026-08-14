package chapter06.video55;

public class Video55 {
	public static void main(String[] args) {
		Student st1 = new Student("eric", 25);
		Student st2 = new Student("hoidanit", 30);
		System.out.println("Check student 1 name = " + st1.name);
		System.out.println("Check student 2 name = " + st2.name);

		Student st3 = new Student();
		st3.name = "test no contructor";
		System.out.println("Check student 3 name = " + st3.name);
	}
}
