package Java6_1_6;
import java.util.*;
public class Level1 {
    static void main() {


        Scanner sc = new Scanner(System.in);


        // 1. Voting eligibility for students (10 ages)

        int[] ages = new int[10];

        System.out.println("Enter ages of 10 students:");
        for (int i = 0; i < ages.length; i++) {
            ages[i] = sc.nextInt();
        }

        for (int i = 0; i < ages.length; i++) {
            if (ages[i] < 0) {
                System.out.println("Invalid age");
            } else if (ages[i] >= 18) {
                System.out.println("The student with the age " + ages[i] + " can vote");
            } else {
                System.out.println("The student with the age " + ages[i] + " cannot vote");
            }
        }


        // 2. Check positive, negative, zero & even/odd (5 numbers)

        int[] numbers = new int[5];

        System.out.println("\nEnter 5 numbers:");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = sc.nextInt();
        }

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > 0) {
                if (numbers[i] % 2 == 0) {
                    System.out.println(numbers[i] + " is positive and even");
                } else {
                    System.out.println(numbers[i] + " is positive and odd");
                }
            } else if (numbers[i] < 0) {
                System.out.println(numbers[i] + " is negative");
            } else {
                System.out.println(numbers[i] + " is zero");
            }
        }

        if (numbers[0] == numbers[numbers.length - 1]) {
            System.out.println("First and last elements are equal");
        } else if (numbers[0] > numbers[numbers.length - 1]) {
            System.out.println("First element is greater than last element");
        } else {
            System.out.println("First element is less than last element");
        }


        // 3. Multiplication table (1 to 10)

        System.out.println("\nEnter a number for multiplication table:");
        int num = sc.nextInt();

        int[] table = new int[10];

        for (int i = 1; i <= 10; i++) {
            table[i - 1] = num * i;
        }

        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " * " + i + " = " + table[i - 1]);
        }


        // 4. Store up to 10 numbers until 0 or negative & find sum

        double[] values = new double[10];
        double total = 0.0;
        int index = 0;

        System.out.println("\nEnter numbers (0 or negative to stop):");
        while (true) {
            double input = sc.nextDouble();

            if (input <= 0 || index == 10) {
                break;
            }

            values[index] = input;
            index++;
        }

        System.out.println("Entered numbers:");
        for (int i = 0; i < index; i++) {
            System.out.println(values[i]);
            total += values[i];
        }

        System.out.println("Sum of numbers: " + total);


        // 5. Multiplication table from 6 to 9

        System.out.println("\nEnter a number for multiplication table (6 to 9):");
        int number = sc.nextInt();

        int[] multiplicationResult = new int[4];

        int k = 0;
        for (int i = 6; i <= 9; i++) {
            multiplicationResult[k] = number * i;
            k++;
        }

        k = 0;
        for (int i = 6; i <= 9; i++) {
            System.out.println(number + " * " + i + " = " + multiplicationResult[k]);
            k++;
        }

        sc.close();
    }
}
