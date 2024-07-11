//Design a function that takes a list of integers as input. The function should return True if the list contains two consecutive threes (3 next to a 3) anywhere within the list. Otherwise, it should return False. For example, the function should return True for [1, 3, 3] and False for [1, 3, 1, 3].
//Language used - java


public class fifth {

    public static boolean hasConsecutiveThrees(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == 3 && nums[i + 1] == 3) {                     // Iterate through the list, checking pairs of consecutive elements
                return true;                                            // Found two consecutive threes
            }
        }
        return false;                                                   // No consecutive threes found
    }

    public static void main(String[] args) {
        int[] example1 = {1, 3, 3};                                        //testing to using random integers
        int[] example2 = {1, 3, 1, 3};
        
        System.out.println("Test 1: " + hasConsecutiveThrees(example1));   // Output: true
        System.out.println("Test 2: " + hasConsecutiveThrees(example2));   // Output: false
    }
}