import java.util.*;
public class sumof_digitsofanumber_6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //enter the number
        int n=sc.nextInt();
        int sum =0;
        int temp = n;
        while(temp>0){
            sum=sum+temp%10;
            temp=temp/10;
        }
        System.out.println(sum);
    }

}
