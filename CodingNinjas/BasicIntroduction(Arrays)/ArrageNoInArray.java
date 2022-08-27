/*
You have been given an empty array(ARR) and its size N. The only input taken from the user will be N and you need not worry about the array.
Your task is to populate the array using the integer values in the range 1 to N(both inclusive) in the order - 1,3,5,.......,6,4,2.
Note:
You need not print the array. You only need to populate it.
*/

public class Solution {

	
	public static void arrange(int[] arr, int n){
		
		// System.out.println(n);
        
        int arrNew[]=arr;
     
        int i=0;
        int j = n-1;
        
        for(int num = 1; i<=j; num++)
        {
            if(num % 2 != 0){
            arrNew[i]=num;
            i++;
            }
            else{
			arrNew[j] = num;
                j--;
            }
            
        }
        
	}
	
}
