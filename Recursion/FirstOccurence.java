package Recursion;

public class FirstOccurence {
    public static int firstOccureceofno(int arr[],int n,int i){
        if (i == arr.length) {
            return -1;
        }
        if(arr[i]==n){
            return i;
        }

        return firstOccureceofno(arr, n, i+1);
    }

    public static void main(String[] args) {
        int arr[] ={0,1,2,31,2,0};
        System.out.println(firstOccureceofno(arr,20,1));
    }
}
