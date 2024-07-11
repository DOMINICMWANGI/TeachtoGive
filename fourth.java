//Design a function that determines whether a given string is a pangram. A pangram is a sentence or phrase containing every letter of the alphabet at least once. Punctuation and case are typically ignored. For example, the string "The quick brown fox jumps over the lazy dog" is a pangram, while "Hello, world!" is not.
//Language used - java

public class fourth{

    public static boolean isPangram(String input) {
        if (input == null) {
            return false;
        }

        String normalizedInput = input.toLowerCase().replaceAll("[^a-z]", "");      // Normalize the string: convert to lower case and remove non-alphabetic characters
        Set<Character> uniqueLetters = new HashSet<>();                             // Use a set to track unique letters
        for (char c : normalizedInput.toCharArray()) {
            uniqueLetters.add(c);                                                   // Add each unique letter to the set
        }                       

        return uniqueLetters.size() == 26;                                          // Check if the set contains 26 letters
    }

    public static void main(String[] args) {
        String example1 = "The quick brown fox jumps over the lazy dog";
        String example2 = "Hello, world!";
        
        System.out.println("Is pangram: " + isPangram(example1));                      // Output: true
        System.out.println("Is pangram: " + isPangram(exapmle2));                      // Output: false