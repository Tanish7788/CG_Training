import java.util.Scanner;

public class primenumber_12 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number till primecheck");
        int n = sc.nextInt();

        if(n>=1){
            System.out.println("1");
        }
        if(n>=2){
            System.out.println("2");
        }
        if(n>=3){
            System.out.println("3");
        }

        for(int i=4;i<n;i++){
            boolean isprime = true;
            for(int j=2;j<i;j++){
                if((i%j == 0) ){
                    isprime=false;
                    break;
                }


            }
            if(isprime==true){
                System.out.println(i);
            }

        }


    }
}
