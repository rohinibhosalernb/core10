package Array_08_02;

import java.util.Scanner;

/*Write a Java program to find sum of even and odd number separately
Java program to find sum of even and odd number
Output should be:
Even: 12
Odd: 16*/
public class Array_sum_evenodd {

	public static void main(String[] args) {
		
        int n, sum_even = 0, sum_odd = 0;

        Scanner s = new Scanner(System.in);

        System.out.print("Enter the number of elements in array:");

        n = s.nextInt();

        int[] a = new int[n];

        System.out.println("Enter the elements of the array:");

        for(int i = 0; i < n; i++)

        {

            a[i] = s.nextInt();

        }

        for(int i = 0; i < n; i++)

        {

            if(a[i] % 2 == 0)

            {

                sum_even = sum_even + a[i];

            }

            else

            {

                sum_odd = sum_odd + a[i];

            }

        }

        System.out.println("Sum of Even Numbers:"+sum_even);

        System.out.println("Sum of Odd Numbers:"+sum_odd);

    }
		
	}


