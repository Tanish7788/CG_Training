import java.util.*;
public class even_odd_count_in_number_21 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int n = sc.nextInt();

        int odd = 0;
        int even =0;

        int temp = n;

        while(temp>0){
            int digit = temp % 10;

            if(digit == 2 || digit == 0 || digit % 2 ==0){
                even++;
            }
            if(digit == 3 || digit == 1 || digit % 2 !=0){
                odd++;
            }

            temp=temp/10;

        }
        System.out.println("even=" + even);
        System.out.println("odd=" + odd);

    }
}
