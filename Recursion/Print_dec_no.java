package Recursion;

public class Print_dec_no {
    public static int printDecNo(int n){
        if(n==0){
            return 0;
        }
        System.out.print(n);
        return printDecNo(n-1);
    }

    public static void main(String[] args) {
        printDecNo(10);
    }
}
