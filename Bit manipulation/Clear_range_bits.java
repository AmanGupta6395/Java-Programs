package Bit_Manipulation;

public class Clear_range_bits {
    public static int clearRange(int n, int i, int j){
        int bitmask1=((~0)<<(j+1));//000011
        int bitmask2 =(1<<i)-1;//110000
        int bitmask = bitmask1|bitmask2;
        return n&bitmask;
    }

    public static void main(String[] args) {
        int r = clearRange(31,2,4);
        System.out.println(r);
    }
}
