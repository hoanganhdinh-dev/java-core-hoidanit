package chapter08.video78;

public class Motobike extends Vehicle {

	public Motobike(String brand) {
		super(brand);
	}

	@Override
	public void start() {
		System.out.println("Motobike " + super.getBrand() + " is kick-starting...");

	}
}