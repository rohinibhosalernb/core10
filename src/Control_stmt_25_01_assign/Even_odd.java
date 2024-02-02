package Control_stmt_25_01_assign;

import java.util.Scanner;

/*3] Write a Java program to find the number of even and odd integers in
a given array of integers.
*/
public class Even_odd {

	public static void main(String[] args) {
		int n;

        Scanner s = new Scanner(System.in);

        System.out.print("Enter size for array:");

        n = s.nextInt();

        int a[] = new int[n];

        System.out.println("Enter array elements:");

        for(int i = 0; i < n; i++)

        {

            a[i] = s.nextInt();
            
        }
           
        System.out.print("Odd numbers=");

        for(int i = 0 ; i < n ; i++)

        {

            if(a[i] % 2 != 0)

            {

                System.out.print(a[i]+" ");

            }

        }

        System.out.println("");

        System.out.print("Even numbers are=");

        for(int i = 0 ; i < n ; i++)

        {

            if(a[i] % 2 == 0)

            {

                System.out.print(a[i]+" ");

            }

        }
	}

}
