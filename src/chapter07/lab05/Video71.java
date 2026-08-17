package chapter07.lab05;

public class Video71 {
	public static void main(String[] args) {
		Manager boss = new Manager("hoidanit", 25, "M001", 2000, "Sales");
		boss.introduce();
		System.out.println();
		System.out.println("Lương cơ bản: " + boss.calculateSalary());
		System.out.println("Lương sau thưởng: " + boss.calculateSalary(500));
	}
}