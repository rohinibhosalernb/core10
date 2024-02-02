package Control_stmt_25_01_assign;
//2] Write a Java program to calculate the average value of array
//elements.

import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		float average;
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

        average = (float)sum / n;

        System.out.println("Average:"+average);
	}

}
