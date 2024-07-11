//Design a function that takes a string or sequence of characters as input and returns the character that appears most frequently.Eg 11189 => '1', hello => l
//Language - java


public class third {

    public static char mostFrequentChar(String input) {                 //allow input for characters
        if (input == null || input.isEmpty()) {
            throw new IllegalArgumentException("Input string cannot be null or empty");
        }

        Map<Character, Integer> charFrequency = new HashMap<>();        // Initialize a HashMap to store the frequency of each character
        for (char c : input.toCharArray()) {
            charFrequency.put(c, charFrequency.getOrDefault(c, 0) + 1);
        }                                                               // Iterate through the input string to count the frequency of each character

        char mostFrequentChar = input.charAt(0);
        int maxFrequency = 0;
        for (Map.Entry<Character, Integer> entry : charFrequency.entrySet()) {
            if (entry.getValue() > maxFrequency) {
                mostFrequentChar = entry.getKey();
                maxFrequency = entry.getValue();
            }                                                           // Find the character with the maximum frequency
        }

        return mostFrequentChar;
    }

    public static void main(String[] args) {
        String input1 = "11189";                                        // Change this value to test with different numbers and characters
        String input2 = "hello";
        
        System.out.println("Most frequent character in '11189': " + mostFrequentChar(input1));      // Output: '1'
        System.out.println("Most frequent character in 'hello': " + mostFrequentChar(input2));      // Output: 'l'
    }
}