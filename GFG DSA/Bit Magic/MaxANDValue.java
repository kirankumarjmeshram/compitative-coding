/*Given an array arr[] of N positive elements. 
The task is to find the Maximum AND Value generated by any pair(arri, arrj) 
from the array such that i != j.
Note: AND is bitwise '&' operator.
 * 
 */

public class MaxANDValue {
    public static int maxAND (int arr[], int N) {
        //BruteForce
        int maxVal = 0;
        for(int i = 0; i<N;i++){
            for(int j = i+1;j<N;j++){
                maxVal = Math.max(arr[i]&arr[j], maxVal);
            }
        }
        return maxVal;
    }
}
