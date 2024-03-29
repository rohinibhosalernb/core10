package Array_08_02;

import java.util.Arrays;

/*Create two arrays with same no of integer element and create third array which contains
sum of two arrays
Array1:
integer array in java
Array2:
integer array 2 in java
Output*/
public class Array_sum_2 {

	public static void main(String[] args) {
		//Declare and initialize the array elements
	      int[] a = {51, 16, 33, 2, 14, 21};
	      int[] b = {33, 9, 56, 21, 39, 21};

	      //get length of an array and store it in c array 
	      int[] c = new int[a.length];

	      //check if length of both array are equal
	      if(a.length==b.length){
	         //logic implementation
	         for (int i = 0 ,j=0,k=0; i < a.length; i++,j++,k++){
	            c[k] = a[i] + b[j];
	         }

	         //Print the result
	         System.out.println("Resultant array is:");
	         System.out.println(Arrays.toString(c));
	      } else {
	         System.out.println("Length of both array should be same");
	      }
	   }
	

}
