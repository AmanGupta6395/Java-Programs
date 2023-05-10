package Bit_Manipulation;

public class clear_ith_bit {
    public static int clearithbit(int n, int i){
        int bitmask= ~(1<<i);
        return (n&bitmask);
    }

    public static void main(String[] args) {
        int r =clearithbit(10,1);
        System.out.println(r);
    }
}
