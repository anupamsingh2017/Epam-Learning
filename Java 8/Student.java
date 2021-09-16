
class Student {
	private String name;
	private String std;
	private int age;

	Student() {
		System.out.println("Constructor Without Parameters");
	}

	Student(String name, String std, int age) {
		System.out.println("Parameterized Constructor");
		this.name = name;
		this.std = std;
		this.age = age;
	}

	public String toString() {
		return "Student Details: " + name + " | " + std + " | " + age;
	}
	
	public static void main(String[] args) {
		StudentDetailsWithoutParameters obj1 = Student::new;
		System.out.println(obj1.getStudent());
		
		StudentDetailsWithParameters obj2 = Student::new;
		System.out.println(obj2.getStudent("Anupam", "XII", 17));
	}
}
