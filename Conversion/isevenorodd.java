package Bit_Manipulation;

public class isevenorodd {
    public static void isEvenorOdd(int n){
        int bitMask = 1;
        if((n&bitMask)==0){
            System.out.println("even");
        }
        else{
            System.out.println("odd");
        }
    }

    public static void main(String[] args) {
        isEvenorOdd(3);
        isEvenorOdd(11);
        isEvenorOdd(14);
    }
}
