import java.util.Scanner;

class Node {
    char data;
    Node next;

    Node(char data) {
        this.data = data;
    }
}

public class PalindromeCheckerApp{G

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String word = sc.next();

        // Convert string to linked list
        Node head = null, temp = null;

        for (int i = 0; i < word.length(); i++) {
            Node newNode = new Node(word.charAt(i));

            if (head == null) {
                head = newNode;
                temp = newNode;
            } else {
                temp.next = newNode;
                temp = newNode;
            }
        }

        // Find middle using slow & fast pointer
        Node slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Reverse second half
        Node prev = null, current = slow, next;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        // Compare first half and reversed second half
        Node first = head;
        Node second = prev;
        boolean isPalindrome = true;

        while (second != null) {
            if (first.data != second.data) {
                isPalindrome = false;
                break;
            }
            first = first.next;
            second = second.next;
        }

        if (isPalindrome)
            System.out.println(word + " is a Palindrome.");
        else
            System.out.println(word + " is NOT a Palindrome.");

        sc.close();
    }
}