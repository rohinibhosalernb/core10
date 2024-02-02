package Control_stmt_25_01_assign;

public class PrintArrayInRiverse {
	
	public static void main(String[] args) {
		
		int[] arr = {20,10,40,50,30,60,70};

		PrintArrayInRiverse obj = new PrintArrayInRiverse();
		obj.findMaxAndMinElement(arr);
		
	}
	
	void findMaxAndMinElement(int[] arr) {
		
		int minVal = arr[0];
		int maxVal = arr[0];
		
		for(int i=0 ; i<arr.length ; i++) {
			
			int val = arr[i];
			
			if(val < minVal) {
				minVal = val;
			}
			
			if(val > maxVal) {
				maxVal = val;
			}
			System.out.println(arr[i]);
			
		}
		
		System.out.println("Minimum Value from array is-"+minVal);
		System.out.println("Maximum value from array is-"+maxVal);
		
	}

	void test(int[] arr) {
		
		//int[] arr1 = new int[7];
		
				//arr1[0] = 10;
				//arr1[1] = 20;
				
				for(int i=arr.length-1; i  >= 0; i--) {
					System.out.println(arr[i]);
				}
				
				System.out.println("Print alternate element in array");
				
				for(int i=0; i< arr.length;i=i+2) {
					System.out.println(arr[i]);
				}
	}
}
