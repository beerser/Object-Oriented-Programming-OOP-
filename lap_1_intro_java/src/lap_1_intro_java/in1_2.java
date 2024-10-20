package lap_1_intro_java;
import java.util.Scanner;

public class in1_2 {
    public static void main(String[] args) {
        System.out.print("input ");
        Scanner sc = new Scanner(System.in);
        double f = sc.nextDouble();
        System.out.println(String.format("C = "+"%.6f",(5.0/9.0)*(f-32.0)));
    }
}
