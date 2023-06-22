package human;

import technic.Car;

class BankAccount {
	
	int id;
	String name;
	double balance;
	
	double addBalance(double add) {
		if(add > 0) {
			balance += add;
		} else {
			System.out.println("Set positive number");
		}
		return balance;
	}
	
	double subtractBalance(double add) {
		if(add > 0) {
			balance -= add;
		} else {
			System.out.println("Set positive number");
		}
		return balance;
	}
	
}

// Описывает параметры относящиеся к студенту
class Student {
	
	Student(String studName, String studSurname){
		this(0, studName, studSurname, 0, 0.0, 0.0, 0.0);
	}
	
	Student(int studIdNum, String studName, String studSurname, int course) {
		this(studIdNum, studName, studSurname, course, 0.0, 0.0, 0.0);
	}
	
	Student(int studIdNum, String studName, String studSurname, int course, double mathGPA, 
	double economyGPA, double foreignLangGPA) {
		this.studIdNum = studIdNum;
		this.studName = studName;
		this.studSurname = studSurname;
		this.course = course;
		this.mathGPA = mathGPA;
		this.economyGPA = economyGPA;
		this.foreignLangGPA = foreignLangGPA;
	}
	
	int studIdNum;
	String studName;
	String studSurname;
	int course;
	double mathGPA;
	double economyGPA;
	double foreignLangGPA;
	
	double showScore() {
		return (mathGPA + economyGPA + foreignLangGPA) / 3;
	}
	
}

//Описывает параметры человека. Включает в себя все ранее созданные классы
public class Human {
	
	Human(int id, String name, String surname){
		this.id = id;
		this.name = name;
		this.surname = surname;
	}
	
	Human(int id, String name, String surname, int age, boolean isStudent, boolean isEmployee) {
		this.id = id;
		this.name = name;
		this.surname = surname;
		this.age = age;
		this.isStudent = isStudent;
		this.isEmployee = isEmployee;
		
		if(this.isStudent) {
			student = new Student(this.name, this.surname);
		}
		
		if(this.isEmployee) {
			employee = new Employee(this.age, this.surname);
		}
	}
	
	int id;
	String name;
	String surname;
	int age;
	boolean isStudent;
	boolean isEmployee;
	
	BankAccount bankAccount;
	Student student;
	Employee employee;
	
	public static void main(String[] args) {
		
		Human person1 = new Human(0001, "Marat", "Gizatullin", 21, true, true);
		
		System.out.println(person1.student.studName);
		
		person1.student.mathGPA = 3.4;
		person1.student.economyGPA = 3.8;
		person1.student.foreignLangGPA = 4.6;
		
		System.out.println("Score: " + person1.student.showScore());
		
		person1.employee = new Employee(person1.id, person1.surname, person1.age = 21, 60000.0, "Gazprom");
		person1.employee.doublingSalary();
		
		System.out.println("Salary: " + person1.employee.salary + "\n");
		
		Human person2 = new Human(0002, "Kevin", "Smith");
		
		System.out.println(person2.name);
		
		Car car1 = new Car();
		Car car2 = new Car();
		Car car3 = new Car();
		
		System.out.println(Car.idSetter + " " + car1.carId);
		System.out.println(Car.idSetter + " " + car2.carId);
		System.out.println(Car.idSetter + " " + car3.carId);
		
	}

}
