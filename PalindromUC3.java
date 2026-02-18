 import java.util.Scanner;

public class PalindromUC3{

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Input text: ");
        String input = scanner.nextLine();

        // Convert to lowercase to make it case-insensitive
        String original = input.toLowerCase();

        // Reverse the string
        String reversed = new StringBuilder(original).reverse().toString();

        // Check if original equals reversed
        boolean isPalindrome = original.equals(reversed);

        System.out.println("Is it a Palindrome? : " + isPalindrome);

        scanner.close();
    }
}
