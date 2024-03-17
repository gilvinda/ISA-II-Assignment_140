package gilvinda;

public class shapemain_140 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Circle c = new Circle(12.0);
		System.out.println("Circle Area: " + c.calculateArea());
		System.out.println("Circle Perimeter: " + c.calculatePerimeter());
		Triangle triangle = new Triangle(2.0, 2.0, 2.0);
		System.out.println("Triangle Area: " + triangle.calculateArea());
		System.out.println("Triangle Perimeter: " + triangle.calculatePerimeter());
		}
		
	}

