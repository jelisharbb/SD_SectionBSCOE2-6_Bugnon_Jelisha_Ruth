// Palindrome Check:
// A palindrome is a word, phrase, number, or other sequence of characters that reads the same backward as forward.

public class PalindromeChecker {
    public static void main(String[] args) {
        String original = "racecar";
        String reversed = "";

        for (int i = original.length() - 1; i >= 0; i--) {
            reversed += original.charAt(i);
        }

        if (original.equalsIgnoreCase(reversed)) {
            System.out.println("The word '" + original + "' is a palindrome.");
        } else {
            System.out.println("The word '" + original + "' is not a palindrome.");
        }
    }
}
