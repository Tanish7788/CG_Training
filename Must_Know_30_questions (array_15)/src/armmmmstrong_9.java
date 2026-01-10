import java.util.*;
public class armmmmstrong_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int n = sc.nextInt();
        int temp = n;
        int power = 0;

        while(temp>0){
            int digit = temp%10;
            power++;
            temp = temp/10;
        }
        int sum = 0;
        //System.out.println(power);

        //how ton use power
        int tempoo=n;

        while(tempoo>0){
            int difi = tempoo%10;
            int mul =1;
//            for(int i=0;i<power;i++){
//                mul = mul * difi;
//            }

            mul=(int) Math.pow(difi,power);
            sum = sum + mul;
            tempoo=tempoo/10;

        }

        if(sum == n){
            System.out.println("armstrong");
        }
        else{
            System.out.println("no");
        }
    }
}
