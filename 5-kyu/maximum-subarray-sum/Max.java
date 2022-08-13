import java.util.Arrays;

public class Max {
  public static int sequence(int[] arr) {
    // Using Kadane’s algorithm the idea is to maintain a maximum (positive-sum) subarray “ending” at each index of the given array. 
    // This subarray is either empty (in which case its sum is zero) or consists of one more element than the maximum subarray ending
    // at the previous index.
    
    // stores the maximum sum subarray found so far
    int maxSoFar = 0;
    
    // stores the maximum sum of subarray ending at the current position
    int maxEndingHere = 0;
    
    // traverse the given array
    for (int num : arr) {
      // update the maximum sum of subarray "ending" at index `num` (by adding the current element to maximum sum 
      // ending at previous index)
      maxEndingHere = maxEndingHere + num;
      
      // maximum sum should be more than the current element
      maxEndingHere = Integer.max(maxEndingHere, num);
      
      // update the result if the current subarray sum is found to be greater
      maxSoFar = Integer.max(maxSoFar, maxEndingHere);
    }
    
    return maxSoFar;
  }
}
