package lap_1_intro_java;

import java.util.Scanner;

public class in2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the monthly saving amount: ");
        double ms = sc.nextDouble();
        double sum = 0;
        for(int i=0;i<6;i++){
            sum = (ms+sum)*(1.0+0.00417);
        }
        System.out.println(String.format("After the sixth month,the account value is $%.2f",sum));
    }
}
