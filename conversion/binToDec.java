package conversion;

import java.util.*;

public class binToDec {
     static int binaryToDecimal(int n){
        int pow= 0;
        int Dec = 0;
        while(n>0){
           int lastdigit = n%10;
           Dec = Dec +(lastdigit*(int) Math.pow(2,pow));
           pow++;
           n/=10;
        }
            return Dec;
         }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter binary Value");
        int binaryNo=sc.nextInt();
        int decimalNo=binaryToDecimal(binaryNo);
        System.out.println(decimalNo);
        System.out.println(~1);
    }
}
