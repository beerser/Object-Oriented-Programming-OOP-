package exercis_1;

import java.util.Scanner;

public class in8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please input n,a0 and a1: " );
        int n = sc.nextInt();
        int a0 = sc.nextInt();
        int a1 = sc.nextInt();
        int[] arr = new int[n+1];
        arr[0] = a0;
        arr[1] = a1;
        for(int k=2;k<=n;k++){
            arr[k] = ((int)Math.pow(k, 2)*arr[k-1])-arr[k-2]+(int)Math.pow(3,k);
        }
        System.out.print("Output is:");
        for (int num : arr) {
            System.out.print(num+" ");
        }
    }
}
    

