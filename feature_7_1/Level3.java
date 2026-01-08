package String7_01_26;
import java.util.*;
public class Level3 {
    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Q1: Find frequency of characters using unique characters
        System.out.println("Enter text:");
        String text = sc.nextLine();

        char[] unique = new char[text.length()];
        int uniqueCount = 0;

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            boolean found = false;

            for (int j = 0; j < uniqueCount; j++) {
                if (unique[j] == ch) {
                    found = true;
                    break;
                }
            }

            if (!found) {
                unique[uniqueCount++] = ch;
            }
        }

        int[] freqASCII = new int[256];
        for (int i = 0; i < text.length(); i++) {
            freqASCII[text.charAt(i)]++;
        }

        System.out.println("\nCharacter Frequency (Using Unique Characters)");
        for (int i = 0; i < uniqueCount; i++) {
            System.out.println(unique[i] + " : " + freqASCII[unique[i]]);
        }

        // Q2: Find frequency of characters using nested loops
        char[] chars = text.toCharArray();
        int[] freq = new int[chars.length];

        for (int i = 0; i < chars.length; i++) {
            freq[i] = 1;
            if (chars[i] == '0') continue;

            for (int j = i + 1; j < chars.length; j++) {
                if (chars[i] == chars[j]) {
                    freq[i]++;
                    chars[j] = '0';
                }
            }
        }

        System.out.println("\nCharacter Frequency (Nested Loops)");
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] != '0') {
                System.out.println(chars[i] + " : " + freq[i]);
            }
        }

        // Q3: Palindrome check using loop, recursion logic, and array logic
        System.out.println("\nEnter text for palindrome check:");
        String pal = sc.nextLine();

        boolean isPalindrome1 = true;
        int start = 0, end = pal.length() - 1;

        while (start < end) {
            if (pal.charAt(start) != pal.charAt(end)) {
                isPalindrome1 = false;
                break;
            }
            start++;
            end--;
        }

        boolean isPalindrome2 = true;
        int s = 0, e = pal.length() - 1;
        while (s < e) {
            if (pal.charAt(s) != pal.charAt(e)) {
                isPalindrome2 = false;
                break;
            }
            s++;
            e--;
        }

        char[] original = pal.toCharArray();
        char[] reverse = new char[pal.length()];
        int idx = 0;

        for (int i = pal.length() - 1; i >= 0; i--) {
            reverse[idx++] = pal.charAt(i);
        }

        boolean isPalindrome3 = true;
        for (int i = 0; i < original.length; i++) {
            if (original[i] != reverse[i]) {
                isPalindrome3 = false;
                break;
            }
        }

        System.out.println("Palindrome (Logic 1): " + isPalindrome1);
        System.out.println("Palindrome (Logic 2): " + isPalindrome2);
        System.out.println("Palindrome (Logic 3): " + isPalindrome3);

        // Q4: Check if two texts are anagrams
        System.out.println("\nEnter first text for anagram:");
        String a1 = sc.nextLine();

        System.out.println("Enter second text for anagram:");
        String a2 = sc.nextLine();

        boolean isAnagram = true;

        if (a1.length() != a2.length()) {
            isAnagram = false;
        } else {
            int[] f1 = new int[256];
            int[] f2 = new int[256];

            for (int i = 0; i < a1.length(); i++) {
                f1[a1.charAt(i)]++;
                f2[a2.charAt(i)]++;
            }

            for (int i = 0; i < 256; i++) {
                if (f1[i] != f2[i]) {
                    isAnagram = false;
                    break;
                }
            }
        }

        System.out.println("Are Anagrams? " + isAnagram);

        sc.close();
    }
}
