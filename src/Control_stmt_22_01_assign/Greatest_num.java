package Control_stmt_22_01_assign;

import java.util.Scanner;

public class Greatest_num {

	public static void main(String[] args) {
		int a,b,c;
		System.out.println("Enter three number ");
		Scanner sc = new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		System.out.println("three numbers are = " + a + ","+ b + ","+ c);
		if(a>=b && a>=c) {
			System.out.println("gratest number is "+ a);
		}
		else if(b>=a && b>=c) {
			System.out.println("gratest number is = "+ b);

		}
		else
		{
			System.out.println("gratest number is "+ c);

		}
	}

}
