package Control_stmt_25_01_assign;

import java.util.Scanner;

public class ArrayBasic {
	
	public static void main(String[] args) {
		
		ArrayBasic[] objArray = new ArrayBasic[10];
		
		//Array declaration and initialization
		int[] rollNum;
		rollNum = new int[10];
		
		rollNum[0] = 1;
		rollNum[1] = 2;
		rollNum[2] = 3;
		rollNum[3] = 4;
		
		rollNum[10] = 10;
		
		ArrayBasic obj = new ArrayBasic();
		obj.getArrayValue(rollNum);
		
		int number = 10;
		obj.value(number);
	}
	
	void value(int num) {
		System.out.println(num);
	}
	
	void getArrayValue(int[] rollArray) {
		
//		System.out.println(rollArray[0]);
//		System.out.println(rollArray[1]);
//		System.out.println(rollArray[2]);
//		System.out.println(rollArray[3]);
//		
//		System.out.println(rollArray[4]);
		
		for(int i=0; i <= rollArray.length ; i++) {
			
			System.out.println(rollArray[i]);
		}
		
	}
	
	void VariableAddition() {
		
		int num = 10;
		
		System.out.println("Enter First number");
		
		Scanner sc = new Scanner(System.in);
		 int num1 = sc.nextInt();
		
		System.out.println("Enter Second number");
		 int num2 = sc.nextInt();
		 
		 int res = num1 + num2;
		 
		 System.out.println("Addition result is-"+res);
	}

}
