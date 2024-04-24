package basic.dev;

public class Person {
	// Thuộc tính Name
	private String name;

	// Thuộc tính Age
	private int age;

	// Phương thức khởi tạo
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	// Phương thức get cho thuộc tính Name
	public String getName() {
		return name;
	}

	// Phương thức set cho thuộc tính Name
	public void setName(String name) {
		this.name = name;
	}

	// Phương thức get cho thuộc tính Age
	public int getAge() {
		return age;
	}

	// Phương thức set cho thuộc tính Age
	public void setAge(int age) {
		this.age = age;
	}
}
