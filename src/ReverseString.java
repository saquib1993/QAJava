
public class ReverseString {
	 public static String reverseWords(String input) {
	        if (input == null || input.trim().isEmpty()) {
	            return input;
	        }
	 
	        String[] words = input.split("\\s+");
	        StringBuilder reversed = new StringBuilder();
	 
	        for (int i = words.length - 1; i >= 0; i--) {
	            reversed.append(words[i]);
	            if (i != 0) {
	                reversed.append(" ");
	            }
	        }
	 
	        return reversed.toString();
	    }
	 
	    public static void main(String[] args) {
	        String input = "The quick brown fox jumps over the lazy dog";
	        System.out.println(reverseWords(input)); // Output: "dog lazy the over jumps fox brown quick The"
	    }
	}