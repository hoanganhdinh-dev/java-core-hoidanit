package chapter08.video78;

public class Video78 {
	public static void main(String[] args) {

		Car myCar = new Car("toyota");
		Bus myBus = new Bus("Vin");
		Motobike myMotor = new Motobike("Honda");

//		Vehicle[] phuongTien = new Vehicle[3];
//		phuongTien[0] = myCar;
//		phuongTien[1] = myBus;
//		phuongTien[2] = myMotor;

		Vehicle[] phuongTien = { myCar, myBus, myMotor };
		for (Vehicle vehicle : phuongTien) {
			vehicle.start(); // run time
		}
	}
}