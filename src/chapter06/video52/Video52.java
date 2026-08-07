package chapter06.video52;

public class Video52 {
	public static void main(String[] args) {
		Student sinhvien1 = new Student();
		sinhvien1.age = 25;
		sinhvien1.name = "hoidanit";

		System.out.println("Info sinh vien 1, age = " + sinhvien1.age + " name = " + sinhvien1.name);

		sinhvien1.learnJava();

		Student sinhvien2 = new Student();
		sinhvien2.age = 18;
		sinhvien2.name = "eric";

		System.out.println("Info sinh vien 2, age = " + sinhvien2.age + " name = " + sinhvien2.name);
	}
}
