import java.util.Scanner;

public class average {
    public static void average(int a,int b,int c){
        float avg = (a + b + c) / 3;
        System.out.println(avg);
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a=sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        average(a,b,c);
    }
}
