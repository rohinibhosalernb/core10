package String_07_03_2024_assign;

public class Revrese_word_sentence {
	
	    public static void main(String[] args) {
	        String sentence = "Java programs are portable";
	        System.out.println("Original sentence: " + sentence);

	        // Convert the sentence to character array
	        char[] chars = sentence.toCharArray();

	        // Reverse each word in the sentence
	        int start = 0;
	        for (int i = 0; i < chars.length; i++) {
	            if (chars[i] == ' ' || i == chars.length - 1) {
	                int end = i == chars.length - 1 ? i : i - 1;
	                while (start < end) {
	                    char temp = chars[start];
	                    chars[start] = chars[end];
	                    chars[end] = temp;
	                    start++;
	                    end--;
	                }
	                start = i + 1;
	            }
	        }

	        // Convert the character array back to string
	        String reversedSentence = new String(chars);

	        System.out.println("Reversed sentence: " + reversedSentence);
	    }
	

}
