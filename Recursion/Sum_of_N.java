package Recursion;

public class Sum_of_N {
    public static int sumnNaturalno(int n){
        if(n==1){
            return 1;
        }
        return n+sumnNaturalno(n-1);
    }

    public static void main(String[] args) {
        int r = sumnNaturalno(04);
        System.out.println(r);
    }
}
