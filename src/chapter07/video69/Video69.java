package chapter07.video69;

public class Video69 {
	public static int sum(int a, int b) {
		return a + b;
	}

	public static double sum(double a, double b) {
		return a + b;
	}

	public static int sum(int a, int b, int c) {
		return a + b + c;
	}

	public static void main(String[] args) {
		System.out.println("Sum = " + sum(6, 9));
		System.out.println("Sum = " + sum(6.3, 9.6));
		System.out.println("Sum = " + sum(1, 2, 3));
	}
}