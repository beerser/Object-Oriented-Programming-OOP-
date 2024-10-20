package lap_1_intro_java;


public class in6 {
    public static void main(String[] args) {
        for(int i=1;i<=9;i++){
            for(int j=1;j<=9;j++){
                System.out.print(String.format("%5d",j*i));
            }
            System.out.println();
        }
    }
}
