import java.util.Scanner;

class PalindromeChecker {

    public boolean checkPalindrome(String input) {

        if (input == null) {
            return false;
        }

        int start = 0;
        int end = input.length() - 1;

        // Compare characters moving inward
        while (start < end) {
            if (input.charAt(start) != input.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }

        return true;
    }
}

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Input: ");
        String input = scanner.nextLine();

        PalindromeChecker checker = new PalindromeChecker();
        boolean result = checker.checkPalindrome(input);

        System.out.println("Is Palindrome? : " + result);

        scanner.close();
    }
}