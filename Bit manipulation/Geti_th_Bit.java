package Bit_Manipulation;

public class Geti_th_Bit {
    public static int getithBit(int n,int i){
        int bitmask = 1<<i;
        if((n& bitmask)==0){
            return 0;
        }
        else{
            return 1;
        }

    }

    public static void main(String[] args) {
        int n=10 ,i=3;
        int bit = getithBit(n,i);
        System.out.println(bit);
    }
}
