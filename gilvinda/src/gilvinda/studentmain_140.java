package gilvinda;

public class studentmain_140 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		student_140[] students = new student_140[3];
		// Create instances and set their values
		students[0] = new student_140();
		students[0].setInfo("Anu",23);
		students[1] = new student_140();
		students[1].setInfo("Diya",21, "Raia");
		students[2] = new student_140();
		students[2].setInfo("Raj",26,"Pernem");
		// Print the name, age, and address of the 3 students
		for (int i = 0; i < 3; i++) {
		System.out.println(students[i]);

		}
		
	}

}