package probsolvingString;
//Write a function that compresses a string such that consecutive occurrences of the same character are replaced
//by the character followed by the count of repetitions.
//•	Example:
//Input: "aabcccccaaa"
//Output: "a2b1c5a3"

public class StringCompression {
    public static void main(String[] args) {
        String input = "aabcccccaaa";
        String compressed = compressString(input);
        System.out.println("Input: " + input);
        System.out.println("Compressed Output: " + compressed);
    }

    public static String compressString(String str) {
        // Handle edge case for empty string
        if (str == null || str.isEmpty()) {
            return str;
        }

        StringBuilder compressed = new StringBuilder();
        int count = 1; // Initialize count for consecutive characters

        // Loop through the string
        for (int i = 1; i < str.length(); i++) {
            // Check if the current character is the same as the previous one
            if (str.charAt(i) == str.charAt(i - 1)) {
                count++; // Increment the count
            } else {
                // Append the previous character and its count
                compressed.append(str.charAt(i - 1));
                compressed.append(count);
                count = 1; // Reset count for the new character
            }
        }

        // Append the last character and its count
        compressed.append(str.charAt(str.length() - 1));
        compressed.append(count);

        // Convert StringBuilder to String
        return compressed.toString();
    }
}


