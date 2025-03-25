package practice;

import java.util.Scanner;

public class palindrome {

    public static int countPalindromes(String s) {
        int count = 0;
        int n = s.length();

        for (int center = 0; center < n; center++) {
            count += expandAroundCenter(s, center, center);
            count += expandAroundCenter(s, center, center + 1);
        }
        return count;
    }

    private static int expandAroundCenter(String s, int left, int right) {
        int count = 0;
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            count++; 
            left--;  
            right++; 
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string:");
        String st = sc.nextLine();
        sc.close();
        System.out.println("Total palindrome substrings: " + countPalindromes(st));
    }
}
