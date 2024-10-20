package lap_1_intro_java;

import java.util.Scanner;

public class in7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please input x,n: ");
        int x = sc.nextInt();
        int n = sc.nextInt();
        int sum = 0;
        for(int i=0;i<=n;i++){
            sum += Math.pow(x,i); 
        }
        System.out.println("Out is:"+sum);
    }
}
