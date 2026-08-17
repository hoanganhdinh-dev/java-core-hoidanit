package chapter08.video76;

public class Video76 {
	public static void main(String[] args) {
		Animal a = new Dog(); // upcasting
		System.out.println(a.getClass());
		a.makeSound();

		// downcasting
		if (a instanceof Dog) {
			Dog d = (Dog) a;
			d.makeSound();
		}
	}
}