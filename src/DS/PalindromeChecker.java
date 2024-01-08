
package DS;
import java.util.*;
public class PalindromeChecker {
    public static boolean isPalindrome(String input) {
        Deque<Character> deque = new ArrayDeque<>();
        String processedInput = input.toLowerCase().replaceAll(" ", "");
        for (int i = 0; i < processedInput.length(); i++) {
            deque.addLast(processedInput.charAt(i));
        }
        while (deque.size() > 1) {
            if (!Objects.equals(deque.removeFirst(), deque.removeLast())) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();
        boolean isInputPalindrome = isPalindrome(inputString);
        if (isInputPalindrome) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }
        scanner.close();
    }
}
