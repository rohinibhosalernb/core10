package Control_stmt_24_01_assign;

import java.util.Scanner;

//Write a program to check whether a entered 
//character is lowercase ( a to z ) or uppercase ( A to Z ).
public class Upper_Lowercase {

	public static void main(String[] args) {
		char c;
		System.out.println("Enter a character");
		Scanner sc = new Scanner(System.in);
		c= sc.next().charAt(0);
		if(Character.isUpperCase(c))
			System.out.println("Entered character is in uppercase ");
		else
			System.out.println("Entered character is in lowercase ");

	}

}
