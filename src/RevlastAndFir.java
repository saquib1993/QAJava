
public class RevlastAndFir {

    public static void main(String[] args) {
        String str = "saquib";

        // Ensure the string has more than 1 character for swapping
        if (str.length() > 1) {
            char firstChar = str.charAt(0); // First character
            char lastChar = str.charAt(str.length() - 1); // Last character
            
            // Swap first and last characters
            String swappedStr = lastChar + str.substring(1, str.length() - 1) + firstChar;
            
            System.out.println("Original string: " + str);
            System.out.println("Swapped string: " + swappedStr);
        } else {
            System.out.println("String is too short to swap characters.");
        }
    }
}

