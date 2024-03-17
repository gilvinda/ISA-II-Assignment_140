package gilvinda;

public class Vechicle_140 {

		int horsepower;
		Vechicle_140(int horsepower) {
		this.horsepower = horsepower;
		}
		public void drive() {
		System.out.println("Vehicle is driving with " + horsepower + " horsepower.");
		}
		}

     class Car extends Vechicle_140 {
     private int horsepower = 80;
     private String make;
     Car(String make) {
     super(50);
     this.make = make;
}

     public void drive() {
     super.drive();
     System.out.println("Car is driving with " + horsepower + " horsepower.");
}
}
