//should be same 121 aage se bhi piche se bhi
import java.util.*;
public class palindrome_3 {
    public static void main(String[] args) {
        //take input
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int digit = 0;
        int rev = 0;
        int temp =n;
        while(temp>0){
            digit=temp%10;
            rev= rev*10 + digit;
            temp = temp/10;
        }
        System.out.println(rev);

        if(rev == n){
            System.out.println("palindrome");
        }
        else{

            System.out.println("not palindrome");
        }
    }

}
