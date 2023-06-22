package technic;

public class Car {
	
	public Car() {
		idSetter++;
		carId = idSetter;
	}
	
	public static int idSetter = 0;
	public int carId;
	
	String brand;
	String model;
	public int year;
	String color;
	int horsepower;
	
	public static void main(String[] args) {
		
	}

}
