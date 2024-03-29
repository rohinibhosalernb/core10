package String_07_03_2024_assign;

public class Reverse_string {

	public static void main(String[] args) {
		
		        String str = "MyJava";
		        String reversed = ""; 

		        // Iterate over the characters of the input string in reverse order
		        for (int i = str.length() - 1; i >= 0; i--) {
		            
		            reversed += str.charAt(i);
		        }

		        System.out.println("original string is = " + str);
		        System.out.println("reverse string is = " + reversed);
		    }
		

}
