/*
  You have been given an integer array/list(ARR) and a number X. Find and return the total number of pairs in the array/list which sum to X.
Note:
Given array/list can contain duplicate elements. */



public class Solution {  

    public static int pairSum(int[] arr, int x){
        int count =0;
        for (int i = 0; i < arr.length; i++) {
            int j =0;
            while(j<arr.length){
                if (i == j) {
                    j++;
                    continue;
                }

                else if(arr[i] + arr[j] == x){
                    count++;
                    j++;
                }
                else {
                    j++;
                }
            }
        }
        return count / 2;
    }
}
