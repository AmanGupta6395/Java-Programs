package Recursion;

public class LastOccurence {
    public static int lastOccurence(int arr[],int n,int i){
        if(i==-1){
            return -1;
        }
        if(arr[i]==n){
            return i;
        }
        return lastOccurence(arr, n, i-1);
    }

    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,1,2,3,4,5,};
        System.out.println(lastOccurence(arr,5, arr.length-1));
    }
}
