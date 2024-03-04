package gilvinda;

import java.util.Scanner;

public class count_digits_140 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("enter a number");
		Scanner scan =new Scanner(System.in);
		int num=scan.nextInt();

		 int count = 0;

		  while (num != 0) {
		      num /= 10;
		      ++count;
		      
		  }
		  System.out.println("Number of digits: " + count);
	}
}


