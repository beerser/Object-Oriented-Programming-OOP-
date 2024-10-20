package lap_1_intro_java;

import java.util.Scanner;

public class in9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max = Integer.MIN_VALUE;
        int count=0;
        while(true){
            int num = sc.nextInt();
            
            if(num == 0){
                break;
            }
            if(num>max){
                max = num;
                count=1;
            }
            else if(num==max){
                count++;
            }
        }
        System.out.println(max+" "+count);
    }
}
