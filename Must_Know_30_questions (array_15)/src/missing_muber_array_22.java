
import java.util.*;

public class missing_muber_array_22 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array");
        int size = sc.nextInt();

        int[] arr = new int[size - 1];   
        int[] arr2 = new int[size];

        // input array
        for (int i = 0; i < size - 1; i++) {
            arr[i] = sc.nextInt();
        }

        // fill expected array (1 to size)
        for (int i = 0; i < size; i++) {
            arr2[i] = i + 1;
        }

        // find missing number
        for (int i = 0; i < size; i++) {
            boolean found = false;

            for (int j = 0; j < size - 1; j++) {
                if (arr2[i] == arr[j]) {
                    found = true;
                    break;
                }
            }

            if (!found) {
                System.out.println("Missing number = " + arr2[i]);
            }
        }
    }
}