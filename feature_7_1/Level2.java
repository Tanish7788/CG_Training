package String7_01_26;
import java.util.*;
public class Level2 {
    static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        // Q1: Find length of string without using length()
        System.out.println("Enter string:");
        String text = sc.next();
        int count = 0;

        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (RuntimeException e) {
        }

        System.out.println("User calculated length: " + count);
        System.out.println("Built-in length: " + text.length());

        sc.nextLine();

        // Q2: Split text into words and compare with split()
        System.out.println("\nEnter sentence:");
        String sentence = sc.nextLine();

        int length = 0;
        try {
            while (true) {
                sentence.charAt(length);
                length++;
            }
        } catch (RuntimeException e) {
        }

        int wordCount = 1;
        for (int i = 0; i < length; i++) {
            if (sentence.charAt(i) == ' ') wordCount++;
        }

        String[] userWords = new String[wordCount];
        String temp = "";
        int index = 0;

        for (int i = 0; i < length; i++) {
            if (sentence.charAt(i) != ' ') {
                temp += sentence.charAt(i);
            } else {
                userWords[index++] = temp;
                temp = "";
            }
        }
        userWords[index] = temp;

        String[] builtWords = sentence.split(" ");

        boolean splitCompare = true;
        if (userWords.length != builtWords.length) {
            splitCompare = false;
        } else {
            for (int i = 0; i < userWords.length; i++) {
                if (!userWords[i].equals(builtWords[i])) {
                    splitCompare = false;
                    break;
                }
            }
        }

        System.out.println("Split comparison result: " + splitCompare);

        // Q3: Split text and return words with lengths in 2D array
        String[][] wordLength = new String[userWords.length][2];

        for (int i = 0; i < userWords.length; i++) {
            int len = 0;
            try {
                while (true) {
                    userWords[i].charAt(len);
                    len++;
                }
            } catch (RuntimeException e) {
            }
            wordLength[i][0] = userWords[i];
            wordLength[i][1] = String.valueOf(len);
        }

        System.out.println("\nWord\tLength");
        for (int i = 0; i < wordLength.length; i++) {
            System.out.println(wordLength[i][0] + "\t" + Integer.parseInt(wordLength[i][1]));
        }

        // Q4: Find shortest and longest word
        int min = Integer.parseInt(wordLength[0][1]);
        int max = min;

        for (int i = 1; i < wordLength.length; i++) {
            int l = Integer.parseInt(wordLength[i][1]);
            if (l < min) min = l;
            if (l > max) max = l;
        }

        System.out.println("\nShortest word length: " + min);
        System.out.println("Longest word length: " + max);

        // Q5: Count vowels and consonants
        int vowels = 0, consonants = 0;

        for (int i = 0; i < length; i++) {
            char ch = sentence.charAt(i);

            if (ch >= 'A' && ch <= 'Z') ch = (char)(ch + 32);

            if (ch >= 'a' && ch <= 'z') {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
                    vowels++;
                else
                    consonants++;
            }
        }

        System.out.println("\nVowels count: " + vowels);
        System.out.println("Consonants count: " + consonants);

        // Q6: Display character type (Vowel/Consonant/Not a Letter)
        System.out.println("\nCharacter\tType");

        for (int i = 0; i < length; i++) {
            char ch = sentence.charAt(i);
            char original = ch;

            if (ch >= 'A' && ch <= 'Z') ch = (char)(ch + 32);

            String type;
            if (ch >= 'a' && ch <= 'z') {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
                    type = "Vowel";
                else
                    type = "Consonant";
            } else {
                type = "Not a Letter";
            }

            System.out.println(original + "\t\t" + type);
        }

        sc.close();
    }
}
