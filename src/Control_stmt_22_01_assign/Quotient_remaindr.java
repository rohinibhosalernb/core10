package Control_stmt_22_01_assign;

import java.util.Scanner;

public class Quotient_remaindr {

	public static void main(String[] args) {
		System.out.println("Enter the dividend and divisor");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int o = sc.nextInt();
		System.out.println("dividend = "+n +" divisor = " + o);
		System.out.println("Enter your choice 1 for quotient and 2 for remainder ");
		int ch = sc.nextInt();
		switch(ch)
		{
		case 1:
			int  Q = (n/o);
			System.out.println("Quotient =" + Q);
			break;
		case 2:
			int r =(n%o);
			System.out.println("Remainder ="+ r);
			break;
		default :
			System.out.println("Please enter valid choice");
		}

	}

}
