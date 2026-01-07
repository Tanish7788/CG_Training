package Java6_1_6;
import java.util.*;
public class Level2 {
    static void main() {

        Scanner sc = new Scanner(System.in);

        // -------------------------------------------------
        // 1. Bonus calculation for 10 employees (Zara)
        // -------------------------------------------------
        double[] salary = new double[10];
        double[] yearsOfService = new double[10];
        double[] bonus = new double[10];
        double[] newSalary = new double[10];

        double totalBonus = 0.0;
        double totalOldSalary = 0.0;
        double totalNewSalary = 0.0;

        System.out.println("Enter salary and years of service for 10 employees:");

        for (int i = 0; i < 10; i++) {
            System.out.print("Employee " + (i + 1) + " Salary: ");
            double sal = sc.nextDouble();

            System.out.print("Employee " + (i + 1) + " Years of Service: ");
            double years = sc.nextDouble();

            if (sal <= 0 || years < 0) {
                System.out.println("Invalid input. Please enter again.");
                i--; // decrement index to re-enter
                continue;
            }

            salary[i] = sal;
            yearsOfService[i] = years;
        }

        for (int i = 0; i < 10; i++) {
            if (yearsOfService[i] > 5) {
                bonus[i] = salary[i] * 0.05;
            } else {
                bonus[i] = salary[i] * 0.02;
            }

            newSalary[i] = salary[i] + bonus[i];

            totalBonus += bonus[i];
            totalOldSalary += salary[i];
            totalNewSalary += newSalary[i];
        }

        System.out.println("\nTotal Bonus Paid by Zara: " + totalBonus);
        System.out.println("Total Old Salary: " + totalOldSalary);
        System.out.println("Total New Salary: " + totalNewSalary);

        // -------------------------------------------------
        // 2. Youngest and Tallest among Amar, Akbar, Anthony
        // -------------------------------------------------
        String[] names = {"Amar", "Akbar", "Anthony"};
        int[] ages = new int[3];
        double[] heights = new double[3];

        System.out.println("\nEnter age and height of Amar, Akbar, and Anthony:");

        for (int i = 0; i < 3; i++) {
            System.out.print(names[i] + " Age: ");
            ages[i] = sc.nextInt();

            System.out.print(names[i] + " Height: ");
            heights[i] = sc.nextDouble();
        }

        int youngestIndex = 0;
        int tallestIndex = 0;

        for (int i = 1; i < 3; i++) {
            if (ages[i] < ages[youngestIndex]) {
                youngestIndex = i;
            }

            if (heights[i] > heights[tallestIndex]) {
                tallestIndex = i;
            }
        }

        System.out.println("\nYoungest Friend: " + names[youngestIndex] +
                " (Age: " + ages[youngestIndex] + ")");
        System.out.println("Tallest Friend: " + names[tallestIndex] +
                " (Height: " + heights[tallestIndex] + ")");

        sc.close();
    }
}
