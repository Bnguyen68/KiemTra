package basic.dev;

// Lớp Student kế thừa từ lớp Person
public class Student extends Person {
	private double toan;
	private double ly;
	private double hoa;

	public Student(String name, int age, double toan, double ly, double hoa) {
		super(name, age);
		this.toan = toan;
		this.ly = ly;
		this.hoa = hoa;
	}

	public double getToan() {
		return toan;
	}

	public void setToan(double toan) {
		this.toan = toan;
	}

	public double getLy() {
		return ly;
	}

	public void setLy(double ly) {
		this.ly = ly;
	}

	public double getHoa() {
		return hoa;
	}

	public void setHoa(double hoa) {
		this.hoa = hoa;
	}

	public double diemTrungBinh() {
		return (toan + ly + hoa) / 3;
	}
}
