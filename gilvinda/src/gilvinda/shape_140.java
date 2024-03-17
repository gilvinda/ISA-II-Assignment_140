package gilvinda;

abstract class shape_140 {

		abstract double calculateArea();
		abstract double calculatePerimeter();
		}

		class Circle extends shape_140 {
		private double radius;
		public Circle(double radius) {
		this.radius = radius;
		}
		 double
		calculateArea() { return
		Math.PI * radius * radius;
		}
		double
		calculatePerimeter() {
		return 2 * Math.PI * radius;
		}
		}
		
		class Triangle extends shape_140 {
		private double sideA;
		private double sideB;
		private double sideC;

		public Triangle(double sideA, double sideB,
		double sideC) {
		this.sideA = sideA;
		this.sideB = sideB;
		this.sideC = sideC;
		}
		
		double s = (sideA + sideB + sideC) / 2; 
		{
		    Math.sqrt(s * (s - sideA) * (s - sideB) * (s - sideC));
		}
		
		
		 double
		calculatePerimeter() {
		return sideA + sideB + sideC;
		}

		double calculateArea() {
			// TODO Auto-generated method stub
			return 0;
		}
		
		 }
		 
