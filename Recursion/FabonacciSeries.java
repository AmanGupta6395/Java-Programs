package Recursion;

public class FabonacciSeries {
    public static int fibonacci(int n){
        if(n==1||n==2){
            return n-1;
        }
        return fibonacci(n-1)+fibonacci(n-2);
    }

    public static void main(String[] args) {
        int  r =fibonacci(4);
        System.out.println(r);
    }
}
