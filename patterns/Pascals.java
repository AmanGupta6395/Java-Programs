public class Pascals {
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++)
                System.out.print(" ");
            for(int j=1;j<=i;j++){
                if(j==1||i==j)
                    System.out.print(1+" ");
                else System.out.print(i-1+" ");
            }
            System.out.println();
        }
    }
}
