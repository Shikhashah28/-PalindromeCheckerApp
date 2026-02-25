import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.Scanner;
    public class PalindromeCheckerApp{

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            System.out.print("Enter a word: ");
            String word = sc.next();

            Queue<Character> queue = new LinkedList<>();
            Stack<Character> stack = new Stack<>();


            for (char ch : word.toCharArray()) {
                queue.add(ch);
                stack.push(ch);
            }

            boolean isPalindrome = true;

            System.out.println("Comparing Dequeue (Queue) and Pop (Stack):");

            // Compare dequeue and pop
            while (!queue.isEmpty()) {
                char fromQueue = queue.remove();   // Dequeue
                char fromStack = stack.pop();      // Pop

                System.out.println(fromQueue + " - " + fromStack);

                if (fromQueue != fromStack) {
                    isPalindrome = false;
                }
            }

            // Result
            if (isPalindrome) {
                System.out.println(word + " is a Palindrome.");
            } else {
                System.out.println(word + " is NOT a Palindrome.");
            }
        }
    }



