//Design a function that reverses the digits of an integer. For example, 50 should become 5 and -12 should become -21.
//Language used - Java

public class first {

    public static int reverse(int num) {
        boolean isNegative = num < 0;               // Check for negative number
        num = Math.abs(num);                        // Take the absolute value of the number
        String numStr = Integer.toString(num);      // Convert the number to a string
        String reversedStr = new StringBuilder(numStr).reverse().toString();    // Reverse the string
        int reversedNum = Integer.parseInt(reversedStr);    // Convert the reversed string back to an integer
        return isNegative ? -reversedNum : reversedNum;     // Apply the original sign to the reversed integer
    }

    public static void main(String[] args) {
        int num1 = 50;                                      // Change this value to test with different numbers
        int num2 = -12;
        
        System.out.println("Reversed 50: " + reverse(num1));    // Output: 5
        System.out.println("Reversed -12: " + reverse(num2));   // Output: -21
    }
}