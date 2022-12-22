import java.util.Scanner;

public class comndiv {
    static void CommonDivisor(int a,int b){
        int m=0,n=0,r=0;
        for(int i=1,j=1;i<=a/2&&j<=b/2;i++,j++){
            if(a%i==0)
                m=i;
            if(b%j==0)
                n=j;
            if(m==n)
                r=m;

        }
        System.out.println("Greatest Common Divisor of "+a+" and "+b+" is "+r);


    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b = sc.nextInt();
        CommonDivisor(a,b);
    }
}
