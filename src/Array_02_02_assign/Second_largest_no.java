package Array_02_02_assign;

/*Write a program to Find Second Largest Number in Array Java.
For Example:-
Given arr[] is {25,10,35,15,45} then
return second larget element is '15'*/

public class Second_largest_no {

	public static void main(String[] args) {
		int arr[]= new int[] {10,25,77,8,66,45,33,21};
		System.out.println("Before sorting array elements" );
		for(int i=0; i< arr.length ; i++)
		{
			System.out.print(arr[i] +",");
		}
		int temp =0;
		for(int i=0; i<arr.length;i++)
		{
		for(int j=i+1;j<arr.length;j++)
		{
			if(arr[i]>arr[j])
			{
				temp= arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
			
		}
		}
		System.out.println();
		System.out.println("After sorting array elements" );
		for(int i=0; i< arr.length ; i++)
		{
			System.out.print(arr[i] +",");
		}
		System.out.println();
		System.out.println("Second largest element in array ="+" "+ arr[1]);
		 
	}

}
