package Recursion;

public class PrintXpowern {
    public static int xpowern(int x ,int n){
        if(n==0){
            return 1;
        }
        return x*xpowern(x,n-1);
    }

    public static void main(String[] args) {
        System.out.println(xpowern(1,1));
    }
}
