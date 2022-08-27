/*
You have been given an array/list(ARR) of size N. You need to swap every pair of alternate elements in the arraylist.
You don't need to print or return anything, just change in the input array itself.
*/

public class Solution {
    
    public static void swapAlternate(int arr[]) {

        int i=0;
        int j = i+1;
        while(j<=arr.length - 1) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] =temp;

            i+=2;
            j+=2;
        }
    
    }
}
