package Recursion;

public class TillingProblem {
    public static int tillingProblem(int n){
        if(n==0||n==1){
            return 1;
        }
        //Vertical choice
        int fnm1 = tillingProblem(n-1);
        //Horizontal choice
        int fnm2 = tillingProblem(n-2);
        int totalways = fnm1 + fnm2;
        return totalways;
    }

    public static void main(String[] args) {
        System.out.println(tillingProblem(4));
    }
}
