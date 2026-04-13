import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            if (!sc.hasNextLine()) return;
            String original = sc.nextLine().trim();
            String s = original.toLowerCase();

            int left = 0;
            int right = s.length() - 1;
            boolean isPalindrome = true;

            while (left < right) {
                if (s.charAt(left++) != s.charAt(right--)) {
                    isPalindrome = false;
                    break;
                }
            }

            if (isPalindrome) {
                System.out.println(1);
            } else {
                System.out.println(0);
            }
        }
    }
}
