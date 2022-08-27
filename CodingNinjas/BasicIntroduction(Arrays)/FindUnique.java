/*
You have been given an integer array/list(ARR) of size N. Where N is equal to [2M + 1].
Now, in the given array/list, 'M' numbers are present twice and one number is present only once.
You need to find and return that number which is unique in the array/list.
 Note:
Unique element is always present in the array/list according to the given condition.
*/

public class Solution {

    public static int findUnique(int[] arr){
        int unique = 0;
        for (int i = 0; i < arr.length; i++) {
            boolean isUnique = true;
            int j=0;

            while(j<arr.length){
                if (i == j) {
                    j++;
                    continue;
                }
                if (arr[i] == arr[j]){
                    isUnique = false;

                    break;
                }
                else{
                    j++;
                }

            }
            if (isUnique) return arr[i];

        }
        return -1;
    }

}
