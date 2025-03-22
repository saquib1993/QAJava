public class FormatString {
    public static void main(String[] args) {
        String input = "Syed Ahmad knows java programming";
        String[] words = input.split(" ");
        
        // Extract first characters of the first two words
        String output = words[0].charAt(0) + "  " + words[1].charAt(0);
        
        // Append the rest of the sentence
        for (int i = 2; i < words.length; i++) {
            output += " " + words[i];
        }
        
        System.out.println(output);
    }
}

//output: S A knows java programming
