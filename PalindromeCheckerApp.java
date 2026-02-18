import java.util.Scanner;
public class PalindromeCheckerApp {

    public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            System.out.print("Input text: ");
            String input = scanner.nextLine();

            boolean isPalindrome = checkPalindrome(input);
           //uc1
            System.out.println("process initialized");

            System.out.println("Is it a Palindrome? : " + isPalindrome);

            scanner.close();
        }

        public static boolean checkPalindrome(String text) {

            String cleanedText = text.toLowerCase();
            String reversedText = new StringBuilder(cleanedText).reverse().toString();

            return cleanedText.equals(reversedText);
        }
    }



