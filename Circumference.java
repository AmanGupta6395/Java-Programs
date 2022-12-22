import java.util.Scanner;

public class Circumference {
    public static void circum(double r){
        double circum = 2*3.14*r;
        System.out.println(circum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double r=sc.nextDouble();
        circum(r);
    }
}
