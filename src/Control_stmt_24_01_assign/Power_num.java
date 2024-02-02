package Control_stmt_24_01_assign;

import java.util.Scanner;

public class Power_num {

	public static void main(String args[]) {
		 int base;  
	        int exponent;
	        Scanner sc= new Scanner(System.in);
	        base = sc.nextInt();
	        exponent = sc.nextInt();
	        int res = 1;  
	        for (int i = 1; i < exponent; i++)
	        {  
	            res *= base;
	        }
	        System.out.println("base="+" "+base+" , "+"exponent="+" "+exponent +" \n"+"result="+" "+res);
	System.out.println("dmd");
	}
	
	
}
