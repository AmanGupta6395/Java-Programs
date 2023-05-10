package Bit_Manipulation;

public class clear_last_ith_bits {
    public static int clearlastithBits(int n,int i){
        int bitmask = (~0)<<i;
        return n&bitmask;
    }

    public static void main(String[] args) {
        int r = clearlastithBits(31,3);
        System.out.println(r);
    }
}
