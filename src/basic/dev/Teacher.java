package basic.dev;

// Lớp Teacher kế thừa từ lớp Person
public class Teacher extends Person {
	private double hsl; // Hệ số lương

	public Teacher(String name, int age, double hsl) {
		super(name, age);
		this.hsl = hsl;
	}

	public double getHsl() {
		return hsl;
	}

	public void setHsl(double hsl) {
		this.hsl = hsl;
	}

	public double tinhLuong() {
		double luongCoBan = 1800000; // Lương cơ bản
		return luongCoBan * hsl;
	}
}
