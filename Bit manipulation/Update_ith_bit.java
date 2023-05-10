package Bit_Manipulation;

public class Update_ith_bit {
    public static int  updateithBit(int n,int i,int newbit){
        int a = clear_ith_bit.clearithbit(n,i);
        int bitmask = newbit<<i;
        return n|bitmask;
    }

    public static void main(String[] args) {
        int r = updateithBit(10,0,1);
        System.out.println(r);
    }
}
