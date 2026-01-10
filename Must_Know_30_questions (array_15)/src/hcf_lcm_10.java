import java.util.*;
public class hcf_lcm_10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("enter numbers");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        int max =0;
        if(n1>n2){
            max = n1;
        }
        else{
            max = n2;
        }

        int[] arr=new int[max];

        int count=0;
        for(int i=1;i<max;i++){
            if(n1 % i == 0 && n2 % i == 0){
                arr[count++]=i;
            }
            else{
                continue;
            }
        }
        //Arrays.sort(arr);
        int min=999;
        int maxm=0;

        for(int i=1;i<arr.length;i++){
            if(arr[i]<min && arr[i]!=0){
                min = arr[i];
            }
            if(arr[i]>maxm && arr[i]!=0){
                maxm = arr[i];
            }
        }
        System.out.println(maxm);
        int lcm = (n1 * n2) / maxm;
        System.out.println(lcm);

    }
}

// cahtgpt with formulaaa;
/*import java.util.*;

lcm formula
for (int i = max; ; i++) {
            if (i % a == 0 && i % b == 0) {
                lcm = i;
                break;
            }
        }

public class HCF_LCM {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();

        int min;

        if (a < b) {
            min = a;
        } else {
            min = b;
        }

        int hcf = 1;

        // Find HCF
        for (int i = 1; i <= min; i++) {
            if (a % i == 0 && b % i == 0) {
                hcf = i;
            }
        }

        // Find LCM
        int lcm = (a * b) / hcf;

        System.out.println("HCF = " + hcf);
        System.out.println("LCM = " + lcm);
    }
}
Common means same for both numbers.

From above:

Multiples of 4 → 4, 8, 12, 16…

Multiples of 6 → 6, 12, 18…

👉 12 appears in both lists
*/