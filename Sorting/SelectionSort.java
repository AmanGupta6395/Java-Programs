package Sorting;
//Selection Sort : Pick the smallest(from unsorted) put it at the beginning.
public class SelectionSort {
    public static void selectionSort(int[] n){
        int temp = 0;
        for (int i = 0; i <n.length-1;i++){
            int minpos = i;
            for(int j=i+1;j<n.length;j++){
                if(n[minpos]>n[j]){
                    minpos=j;
                }
            }
            temp=n[i];
            n[i]=n[minpos];
            n[minpos]=temp;
        }
        for(int i=0;i<n.length;i++){
            System.out.print(n[i]);
        }
    }

    public static void main(String[] args) {
        int[] n ={3,4,1,1,4,2,5};
        selectionSort(n);

    }
}
