package gilvinda;

import java.util.Scanner;
public class factorial_140 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("enter a number");
		Scanner scan =new Scanner(System.in);
		int num=scan.nextInt();
		int i ,fact=1;
		for(i=1;i<=num;i++)
		{
			fact=fact*i;
		}
		System.out.println("the factorial is "+fact);
	}

}
