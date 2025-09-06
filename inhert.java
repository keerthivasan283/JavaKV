package keerthiv;

class Vehicle{
	String brand;
	int year;
	
	void startEngine() {
		System.out.println("Vechicle start engine"); 
	}
}

class car extends Vehicle{
	String fueltype;
	
	void startEngine() {
		System.out.println("car engine starts");
		
	}
	void drive() {
		System.out.println("car is driving");
	}
}

class Truck extends Vehicle{
	int loadcapacity;
	
	void startEngine() {
		System.out.println("Truck engine starts");
	}
	
	void haul() {
		System.out.println("truck is hauling");
	}
}
public class inhert {

	public static void main(String[] args) {
		car c1 = new car();
		c1.brand = "porsche";
		c1.year=2025;
		c1.fueltype="petrol";
		c1.startEngine();
		c1.drive();
		
		Truck T1 = new Truck();
		T1.brand = "mahindra";
		T1.year = 2022;
		T1.loadcapacity = 235;
		T1.startEngine();
		T1.haul();
		
		
	

	}

}
