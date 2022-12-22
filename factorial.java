import java.util.Scanner;

public class factorial {
    public static void fact(int n){
        int fact =1;
        if(n<1){
            System.out.println("Factorial Not Possible");

        }
        for(int i=1;i<=n;i++){
            fact=fact*i;
        }
        System.out.println(fact);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        fact(n);

    }
}
