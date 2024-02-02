package Control_stmt_24_01_assign;

import java.util.Scanner;

//Assignment – Control Statement
//• Take two int values from user and print greatest among them.
public class Greatest {

	public static void main(String args[])
	{
		int a ,b ;
		System.out.println("Enter the two numbers =" );
		Scanner sc = new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		System.out.println("two numbers are ="+" "+ a+","+b);
		if(a>=b)
			System.out.println("Greatest number is ="+" "+a);
		else
			System.out.println("Greatest number is ="+" "+b);
	}

}

