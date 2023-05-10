package Sorting;
                    //Bubble sort

public class bubbleSort {
    public static void BubbleSort(int[] n){
        int temp=0;
        for(int i=0;i<n.length-1;i++){
            for(int j=0;j<n.length-i-1;j++){
                if(n[j]>n[j+1]){
                    temp = n[j];
                    n[j] = n[j+1];
                    n[j+1] = temp;
                }
            }
        }
        for(int i=0;i<n.length;i++){
            System.out.print(n[i]);
        }
    }

    public static void main(String[] args) {
        int[] n={2,2,4,1,3,5,1,1};
        BubbleSort(n);
    }
}
