package Sorting;

public class InsertionSort {
    public static void insertionSort(int[] n) {
        for (int i = 0; i < n.length; i++) {
            int curr = n[i];
            int prev = i - 1;
            while (prev >= 0 && n[prev] > curr) {
                n[prev + 1] = n[prev];
                prev--;
            }
            n[prev + 1] = curr;
        }
        for (int i = 0; i < n.length; i++) {
            System.out.print(n[i]);
        }
    }
        public static void main(String[] args) {
            int[] n ={3,4,1,1,4,2,5};
            insertionSort(n);

        }
    }

