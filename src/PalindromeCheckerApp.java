import java.util.Scanner;
public class PalindromeCheckerApp {

    public static boolean isPalindrome(String input) {
        // Step 1: Normalize the string
        String normalized = input.toLowerCase().replaceAll("\\s+", "");

        // Step 2: Compare characters from both ends
        for (int i = 0; i < normalized.length() / 2; i++) {
            if (normalized.charAt(i) !=
                    normalized.charAt(normalized.length() - 1 - i)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input: ");
        String input = scanner.nextLine();

        boolean result = isPalindrome(input);

        System.out.println("Is Palindrome? : " + result);

        scanner.close();
    }
}