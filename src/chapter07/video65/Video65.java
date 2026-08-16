package chapter07.video65;

public class Video65 {
	public static void main(String[] args) {
		Student st1 = new Student("hust", "hoidanit", 25);

		// Trường hợp gọi phương thức của lớp cha
//		st1.printInfo();

		// Trường hợp lớp con và lớp cha cùng tên phương thức thì phải khởi tạo hàm có
		// lớp con và cha
		st1.test();
	}
}
