import java.util.*;
public class Palindrome {
    public static boolean isPalindrome(int x) {
        // Convert integer to string
        String numString = Integer.toString(x);
        
        // Initialize pointers for comparison
        int left = 0;
        int right = numString.length() - 1;
        
        // Iterate over the string, comparing characters from both ends
        while (left < right) {
            // If characters at the pointers don't match, it's not a palindrome
            if (numString.charAt(left) != numString.charAt(right)) {
                return false;
            }
            // Move pointers closer to the center
            left++;
            right--;
        }
        
        // If the loop completes without returning false, the integer is a palindrome
        return true;


            // The best solution
            // public boolean isPalindrome(int x) {
            //         if (x < 0 || (x >0 && x % 10 == 0)) {
            //             return false;
            //         }
            //         int y = 0;
            //         for (; y < x; x /= 10) {
            //             y = y * 10 + x % 10;
            //         }
            //         return x == y || x == y / 10;
            //     }
            

    }

    public static void main(String[] args) {
        // Test cases
        int num1 = 121;
        int num2 = -121;
        int num3 = 10;

        System.out.println("Is " + num1 + " a palindrome? " + isPalindrome(num1));
        System.out.println("Is " + num2 + " a palindrome? " + isPalindrome(num2));
        System.out.println("Is " + num3 + " a palindrome? " + isPalindrome(num3));
    }
}
