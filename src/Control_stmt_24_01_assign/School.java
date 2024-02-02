package Control_stmt_24_01_assign;

import java.util.Scanner;

//A school has following rules for grading system:
//a. Below 25 – F b. 25 to 45 – E c. 45 to 50 – D d. 50 to 60 – C
//e. 60 to 80 - B
//f. Above 80 - A
//Ask user to enter marks and print the corresponding grade.
public class School {

	public static void main(String[] args) {
		int m;
		System.out.println("Enter the marks");
		Scanner sc=new Scanner(System.in);
		m=sc.nextInt();
		if(m>80) {
			System.out.println("grade is:-"+ " "+ "A");
		}
		else if(m<=80 && m>=60)
		{
			System.out.println("grade is:-"+ " "+ "B");

		}
		else if(m>=50 && m<60)
		{
			System.out.println("grade is:-"+ " "+ "c");

		}
		else if(m>=45 && m<50)
		{
			System.out.println("grade is:-"+ " "+ "D");

		}
		else if(m>=25 && m<45)
		{
			System.out.println("grade is:-"+ " "+ "E");

		}
		else 
		{
			System.out.println("grade is:-"+ " "+ "F");

		}
	}

}
