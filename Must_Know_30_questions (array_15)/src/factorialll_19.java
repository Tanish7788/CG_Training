import java.util.*;

public class factorialll_19 {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);

        System.out.println("enter a number");
        int n= sc.nextInt();
        int mul=1;
        for(int i = n;i>0;i--){
            mul=mul*i;
        }
        System.out.println(mul);
    }
}
