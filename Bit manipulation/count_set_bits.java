package Bit_Manipulation;

public class count_set_bits {
    public static int countSetBits(int n){
        int count = 0;
        while(n>0){
            if((n&1)==1){
                count ++;
            }
            n=n >> 1;
        }
        return count;
    }

    public static void main(String[] args) {
        int r = countSetBits(31);
        System.out.println(r);
    }
}
