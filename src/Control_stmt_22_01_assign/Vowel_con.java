package Control_stmt_22_01_assign;

import java.util.Scanner;


public class Vowel_con {

	public static void main(String[] args) {
		
		char letter;
		System.out.println("Enter character");
		Scanner sc = new Scanner(System.in);
		letter = sc.next().toLowerCase().charAt(0);
		
		switch(letter)
		{
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
			System.out.println("Entered letter is vowel");
			break ;
		
		
		default :
			System.out.println("Entered letter is Consonent");
		}
	}

}
