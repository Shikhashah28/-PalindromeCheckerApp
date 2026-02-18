import java.util.Scanner;
public class PalindromeCheckerApp {

    public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            System.out.print("Input text: ");
            String input = scanner.nextLine();

            boolean isPalindrome = checkPalindrome(input);

            System.out.println("Is it a Palindrome? : " + isPalindrome);

            scanner.close();
        }

        public static boolean checkPalindrome(String text) {

            String cleanedText = text.toLowerCase();
            String reversedText = new StringBuilder(cleanedText).reverse().toString();

            return cleanedText.equals(reversedText);
        }
    }

