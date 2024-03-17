package gilvinda;
import java.util.Scanner;
public class teachersmain_140 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan=new Scanner(System.in);

		TeacherTeaches teacher = new TeacherTeaches();
		System.out.print("Enter the teacher's name: ");
		String name = scan.nextLine();
		teacher.setName(name);


		System.out.print("Enter the subject the teacher is teaching: ");
		String subject = scan.nextLine();
		teacher.Subjects(subject);
		scan.close();
		}
		}
	

