package gilvinda;

public class student_140 {

	private String name;
	private int age;
	private String address;
	public student_140() {
	this.name = "unknown";
	this.age = 0;
	this.address = "not available";
	}
	// First setInfo method
	public void setInfo(String name, int age) {
	this.name = name;
	this.age = age;
	}
	// Second setInfo method
	public void setInfo(String name, int age, String address) {
	this.name = name;


	this.age = age;
	this.address = address;
	}
	
	
	public String toString() {
	return "Name: " + name + " Age: " + age + ", Address: " + address;
	}
}
