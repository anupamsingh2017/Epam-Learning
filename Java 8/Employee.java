
import java.util.Map;
import java.util.TreeMap;

class Employee {

	private int eID;
	private String name;

	public Employee(int eID, String name) {
		this.eID = eID;
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getID() {
		return eID;
	}

	public void setID(int eID) {
		this.eID = eID;
	}

	public String toString() {
		return this.name + " " + this.eID;
	}

	public static void main(String[] args) {
		Map<Employee, String> map = new TreeMap<>((e1, e2) -> e2.getName().compareTo(e1.getName()));

		Employee e1 = new Employee(1, "David");
		Employee e2 = new Employee(2, "Adam");
		Employee e3 = new Employee(3, "Mark");
		Employee e4 = new Employee(4, "Steve");
		Employee e5 = new Employee(5, "Ricky");

		map.put(e1, e1.getName());
		map.put(e2, e2.getName());
		map.put(e3, e3.getName());
		map.put(e4, e4.getName());
		map.put(e5, e5.getName());

		map.entrySet().stream().forEach(e -> System.out.println(e.getKey() + " : " + e.getValue()));
	}
}
