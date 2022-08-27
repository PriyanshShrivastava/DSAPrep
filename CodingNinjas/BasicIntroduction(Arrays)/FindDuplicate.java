/*
You have been given an integer array/list(ARR) of size N which contains numbers from 0 to (N - 2). Each number is present at least once. That is, if N = 5, the array/list constitutes values ranging from 0 to 3 and among these, there is a single integer value that is present twice. You need to find and return that duplicate number present in the array.

Note :
Duplicate number is always present in the given array/list.
*/

public class Solution {

    public static int duplicateNumber(int[] arr){
        int unique = 0;
        for (int i = 0; i < arr.length; i++) {
            boolean isDuplicate = false;
            int j=0;

            while(j<arr.length){
                if (i == j) {
                    j++;
                    continue;
                }
                if (arr[i] == arr[j]){
                    isDuplicate = true;
                    break;
                }
                else{
                    j++;
                }

            }
            if (isDuplicate) return arr[i];

        }
        return -1;
    }

}
