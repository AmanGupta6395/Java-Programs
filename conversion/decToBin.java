package conversion;

public class decToBin {
    static int decimalToBinary(int n){
        int bin = 0,pow=0;
        while (n>0){
            int rem = n%2;
            bin = bin + rem*(int) Math.pow(10,pow);
            pow++;
            n/=2;
        }
        return bin;
    }
    public static void main(String[] args) {
        int binary = decimalToBinary(63);
        System.out.println(binary);
    }
}
