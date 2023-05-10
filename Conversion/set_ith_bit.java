package Bit_Manipulation;

public class set_ith_bit {
    public static int setithBit(int n, int i){
        int bitmask = 1<<i;
        int r = n|bitmask;
        return r;
    }

    public static void main(String[] args) {
        int r =setithBit(10,2);
        System.out.println(r );
    }
}
