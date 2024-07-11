//Master Yoda, a renowned Jedi Master from the Star Wars universe, is known for his unique way of speaking. He often reverses the order of words in his sentences. For example, instead of saying "I am home" he might say "Home am I" Design a function that takes a sentence as input and returns a new sentence with the words reversed in the same order that Master Yoda would use.
//Language used - java


public class sixth{

    public static String toYodaSpeak(String sentence) {
        String[] words = sentence.split(" ");                       // Split the sentence into words
        StringBuilder yodaSentence = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            yodaSentence.append(words[i]);                          // Reverse the order of the words
            if (i != 0) {
                yodaSentence.append(" ");
            }
        }
        
        return yodaSentence.toString();
    }

    public static void main(String[] args) {
        String sentence1 = "I am home";
        String sentence2 = "The force is strong with this one";
        
        System.out.println("Yoda speak: " + toYodaSpeak(sentence1)); // Output: "home am I"
        System.out.println("Yoda speak: " + toYodaSpeak(sentence2)); // Output: "one this with strong is force The"
    }
}