package gilvinda;

import java.util.Scanner;

public class employeemain_140 {

	public static void main(String[] args) {
		String name,jobtitle;
		double bsal;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter name :");
		name=scan.next();
		System.out.println("Enter Basic salary :");
		bsal=scan.nextDouble();

		
		System.out.println("Enter Job title:");
		jobtitle=scan.next();
		employee_140 e=new employee_140(bsal);
		System.out.println("Basic salary is "+bsal);
		System.out.println("Name is "+name);
		System.out.println("Job title is "+jobtitle);
		System.out.println("Total salary is "+ e.total_sal);
		}
	}


