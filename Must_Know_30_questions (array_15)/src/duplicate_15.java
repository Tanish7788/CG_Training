import java.util.*;
public class duplicate_15 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array");
        int size=sc.nextInt();

        int[] arr=new int[size];

        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }

        for(int i=0;i<arr.length;i++){
            boolean duplicate = false;
            for(int j=i+1;j<arr.length;j++){
                if(i == j){
                    continue;
                }
                if(arr[i]==arr[j]){
                    duplicate = true;
                    break;

                }
            }
            if(duplicate == true){
                System.out.println(arr[i]);
            }

        }
    }
}
