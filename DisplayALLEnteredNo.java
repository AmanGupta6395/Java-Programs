import java.util.Scanner;

public class DisplayALLEnteredNo {
    static void Display(int n){
        Scanner sc=new Scanner(System.in);
        int zero=0,pos=0,neg=0;
        for(int i=1;i<=n;i++) {
            int r= sc.nextInt();
            if(r==0)
                zero++;
            else if(r>0)
               pos++;
            else neg++;
        }
        System.out.println("No of Zeroes "+zero);
        System.out.println("No of Positives "+pos);
        System.out.println("Negatives "+neg);
    }
    public static void main(String[] args) {
        System.out.println("Enter no of Numbers");
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
            Display(n);

    }
}
