import java.util.*;
public class L1_14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n >= 0) {
            int fact = 1, i = 1;
            while (i <= n) {
                fact *= i;
                i++;
            }
            System.out.println(fact);
        }
    }

}
