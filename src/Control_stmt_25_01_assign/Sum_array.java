package Control_stmt_25_01_assign;
//1] Write a Java program to sum values of an array

import java.util.Scanner;

public class Sum_array {

	public static void main(String[] args) {
        int n, sum = 0;

        Scanner s = new Scanner(System.in);

        System.out.print("Enter size for array:");

        n = s.nextInt();

        int a[] = new int[n];

        System.out.println("Enter array elements:");

        for(int i = 0; i < n; i++)

        {

            a[i] = s.nextInt();

            sum = sum + a[i];

        }

        System.out.println("Sum of the array element is:"+sum);

	}

}
