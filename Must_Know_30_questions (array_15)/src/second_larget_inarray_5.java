import java.util.*;
public class second_larget_inarray_5 {
    public static void main(String[] args) {
        System.out.println("enter the size of array");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];

        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }

        Arrays.sort(arr);
        int i=1;

            if(arr[n-1-i]==arr[n-1]){
                i++;

            }
            System.out.println(arr[n-1-i]);

        //System.out.println(arr[n-2]);
    }
}
