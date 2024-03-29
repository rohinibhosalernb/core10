package String_07_03_2024_assign;

public class Occurence_count {


	
	    public static void main(String[] args) {
	        String str = "occurence count";
	        System.out.println("string is = "+" "+str);
	        int[] occurrenceArray = new int[256]; // Assuming ASCII characters

	        // Iterate over the characters of the string
	        for (int i = 0; i < str.length(); i++) {
	            char ch = str.charAt(i);
	            occurrenceArray[ch]++; // Increment the count of the current character
	        }

	        // Display the occurrences
	       
	        for (int i = 0; i < str.length(); i++) {
	            char ch = str.charAt(i);
	            if (occurrenceArray[ch] != 0) {
	                System.out.println(ch + ": " + occurrenceArray[ch]);
	                occurrenceArray[ch] = 0; // Set count to 0 to avoid counting the character again
	            }
	        }
	    }
	

	    

}
