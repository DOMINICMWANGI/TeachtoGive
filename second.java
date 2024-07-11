//Write a recursive function to calculate the factorial of a number
//Language used - Java using the recursive algorithm

public class second {

    public static int factorial(int n) {        // Recursive function to calculate factorial
        if (n == 0) {
            return 1;
        }                                       // Base case: if n is 0, return 1 (0! is 1)

        return n * factorial(n - 1);            // Recursive case: n * factorial of (n-1)
    }

    public static void main(String[] args) {
        int number = 5;                          // Change this value to test with different numbers
        System.out.println("Factorial of " + number + " is: " + factorial(number)); // Output: 120
    }
}