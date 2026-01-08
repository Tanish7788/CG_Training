package String7_01_26;
import java.util.*;
public class Level1 {
    static void main(String[] args) {


        Scanner sc = new Scanner(System.in);


       //  1. Compare two strings using charAt() and equals()

        System.out.println("Enter first string:");
        String s1 = sc.next();

        System.out.println("Enter second string:");
        String s2 = sc.next();

        boolean charCompare = true;

        if (s1.length() != s2.length()) {
            charCompare = false;
        } else {
            for (int i = 0; i < s1.length(); i++) {
                if (s1.charAt(i) != s2.charAt(i)) {
                    charCompare = false;
                    break;
                }
            }
        }

        boolean equalsResult = s1.equals(s2);

        System.out.println("charAt comparison result: " + charCompare);
        System.out.println("equals() result: " + equalsResult);
        System.out.println("Results same? " + (charCompare == equalsResult));



       //  2. Substring using charAt() and substring()

        System.out.println("\nEnter text for substring:");
        String text = sc.next();

        System.out.println("Enter start index:");
        int start = sc.nextInt();

        System.out.println("Enter end index:");
        int end = sc.nextInt();

        String sub1 = "";
        for (int i = start; i < end; i++) {
            sub1 += text.charAt(i);
        }

        String sub2 = text.substring(start, end);

        boolean subCompare = true;
        for (int i = 0; i < sub1.length(); i++) {
            if (sub1.charAt(i) != sub2.charAt(i)) {
                subCompare = false;
                break;
            }
        }

        System.out.println("charAt substring: " + sub1);
        System.out.println("Built-in substring: " + sub2);
        System.out.println("Substring comparison result: " + subCompare);



       //  3. Return characters using charAt() and toCharArray()

        System.out.println("\nEnter string for char array:");
        String charText = sc.next();

        char[] arr1 = new char[charText.length()];
        for (int i = 0; i < charText.length(); i++) {
            arr1[i] = charText.charAt(i);
        }

        char[] arr2 = charText.toCharArray();

        boolean arrayCompare = true;
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                arrayCompare = false;
                break;
            }
        }

        System.out.println("Character arrays same? " + arrayCompare);


        /* -------------------------------------------------
         4. NullPointerException
        ------------------------------------------------- */
        try {
            String nullText = null;
            System.out.println(nullText.length()); // Exception
        } catch (NullPointerException e) {
            System.out.println("NullPointerException handled");
        }


        /* -------------------------------------------------
         5. StringIndexOutOfBoundsException
        ------------------------------------------------- */
        System.out.println("\nEnter string:");
        String indexText = sc.next();

        try {
            System.out.println(indexText.charAt(100));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("StringIndexOutOfBoundsException handled");
        }


        /* -------------------------------------------------
         6. IllegalArgumentException
        ------------------------------------------------- */
        try {
            System.out.println(indexText.substring(5, 2));
        } catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException handled");
        } catch (RuntimeException e) {
            System.out.println("Generic RuntimeException handled");
        }


        /* -------------------------------------------------
         7. NumberFormatException
        ------------------------------------------------- */
        System.out.println("\nEnter text to convert into number:");
        String numText = sc.next();

        try {
            int num = Integer.parseInt(numText);
            System.out.println("Number: " + num);
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException handled");
        } catch (RuntimeException e) {
            System.out.println("Generic RuntimeException handled");
        }


        /* -------------------------------------------------
         8. ArrayIndexOutOfBoundsException
        ------------------------------------------------- */
        String[] names = new String[3];
        names[0] = "Java";
        names[1] = "Python";
        names[2] = "C++";

        try {
            System.out.println(names[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException handled");
        } catch (RuntimeException e) {
            System.out.println("Generic RuntimeException handled");
        }


        /* -------------------------------------------------
         9. Convert text to UPPERCASE using charAt()
        ------------------------------------------------- */
        sc.nextLine();
        System.out.println("\nEnter text for uppercase:");
        String upperText = sc.nextLine();

        String upperResult = "";
        for (int i = 0; i < upperText.length(); i++) {
            char ch = upperText.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                upperResult += (char)(ch - 32);
            } else {
                upperResult += ch;
            }
        }

        String builtUpper = upperText.toUpperCase();

        boolean upperCompare = true;
        for (int i = 0; i < upperResult.length(); i++) {
            if (upperResult.charAt(i) != builtUpper.charAt(i)) {
                upperCompare = false;
                break;
            }
        }

        System.out.println("Uppercase same? " + upperCompare);


        /* -------------------------------------------------
         10. Convert text to lowercase using charAt()
        ------------------------------------------------- */
        System.out.println("\nEnter text for lowercase:");
        String lowerText = sc.nextLine();

        String lowerResult = "";
        for (int i = 0; i < lowerText.length(); i++) {
            char ch = lowerText.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                lowerResult += (char)(ch + 32);
            } else {
                lowerResult += ch;
            }
        }

        String builtLower = lowerText.toLowerCase();

        boolean lowerCompare = true;
        for (int i = 0; i < lowerResult.length(); i++) {
            if (lowerResult.charAt(i) != builtLower.charAt(i)) {
                lowerCompare = false;
                break;
            }
        }

        System.out.println("Lowercase same? " + lowerCompare);

        sc.close();
    }
}
