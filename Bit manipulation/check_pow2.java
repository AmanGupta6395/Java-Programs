package Bit_Manipulation;
//check if a number is power of two or not
public class check_pow2 {
    public static boolean check_no_pow2(int n){
        return (n&(n-1))==0;
    }

    public static void main(String[] args) {
        System.out.println(check_no_pow2(15));
    }
}
