package human;

public class Employee {
	Employee(int id, String surname){
		this.id = id;
		this.surname = surname;
	}
	
	Employee(int id, String surname, int age, double salary, String department) {
		this.id = id;
		this.surname = surname;
		this.age = age;
		this.salary = salary;
		this.department = department;
	}
	
	int id;
	String surname;
	int age;
	double salary;
	final double minSalary = 12000.0;
	String department;
	
	double doublingSalary() {
		return salary *= 2;
	}
	
	public static void main(String[] args) {
		
	}

}
