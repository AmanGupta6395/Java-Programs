public class HalfPyramid {
    public static void main(String[] args) {
        for(int i=1;i<=4;i++){
            for(int j=0;j<=3-i;j++) {
                System.out.print(" ");
            }
                for (int k =1; k <=i; k++)
                    System.out.print("*");

            System.out.println();
        }
    }
}
