package basic.dev;

import java.util.Scanner;

public class MainApp {
	public static void main(String[] args) {
		Person persons[] = new Person[5]; // Khai báo mảng persons có 5 phần tử

		// Nhập thông tin cho danh sách persons
		input(persons);

		// Xuất thông tin của danh sách persons
		print(persons);
	}

	// Hàm nhập thông tin cho danh sách persons
	public static void input(Person person[]) {
		Scanner scanner = new Scanner(System.in);

		for (int i = 0; i < person.length; i++) {
			System.out.println("Nhập thông tin cho người thứ " + (i + 1) + ":");
			System.out.print("Tên: ");
			String name = scanner.nextLine();
			System.out.print("Tuổi: ");
			int age = scanner.nextInt();
			scanner.nextLine(); // Đọc bỏ dòng new line

			if (i < 3) { // Nếu là sinh viên
				System.out.print("Điểm Toán: ");
				double toan = scanner.nextDouble();
				System.out.print("Điểm Lý: ");
				double ly = scanner.nextDouble();
				System.out.print("Điểm Hóa: ");
				double hoa = scanner.nextDouble();
				scanner.nextLine(); // Đọc bỏ dòng new line

				person[i] = new Student(name, age, toan, ly, hoa);
			} else { // Nếu là giáo viên
				System.out.print("Hệ số lương: ");
				double hsl = scanner.nextDouble();
				scanner.nextLine(); // Đọc bỏ dòng new line

				person[i] = new Teacher(name, age, hsl);
			}
		}

		scanner.close();
	}

	// Hàm xuất thông tin của danh sách persons
	public static void print(Person person[]) {
		System.out.println("Thông tin của danh sách persons:");
		int j = 1; // Biến đếm cho giáo viên
		for (int i = 0; i < person.length; i++) {
			System.out.print("Thông tin ");

			if (person[i] instanceof Student) { // Nếu là sinh viên
				System.out.println("học sinh " + (i + 1) + ":");
			} else if (person[i] instanceof Teacher) { // Nếu là giáo viên
				System.out.println("giáo viên " + j + ":");
				j++; // Tăng biến đếm cho giáo viên
			}

			System.out.println("Tên: " + person[i].getName());
			System.out.println("Tuổi: " + person[i].getAge());

			if (person[i] instanceof Student) { // Nếu là sinh viên
				Student student = (Student) person[i];
				System.out.println("Điểm Toán: " + student.getToan());
				System.out.println("Điểm Lý: " + student.getLy());
				System.out.println("Điểm Hóa: " + student.getHoa());
				System.out.println("Điểm Trung bình: " + student.diemTrungBinh());
			} else if (person[i] instanceof Teacher) { // Nếu là giáo viên
				Teacher teacher = (Teacher) person[i];
				System.out.println("Hệ số lương: " + teacher.getHsl());
				System.out.println("Lương: " + teacher.tinhLuong());
			}

			System.out.println();
		}
	}
}
