package exercis_1;

import java.util.Scanner;

public class in4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter balace and initerest rate (e.g., 3 for 3%) : ");
        Double balance = sc.nextDouble();
        Double annualInterestRate = sc.nextDouble();
        Double interest = balance*(annualInterestRate/1200);
        System.out.println(String.format("The niterest is %.5f",interest));
    }
}
