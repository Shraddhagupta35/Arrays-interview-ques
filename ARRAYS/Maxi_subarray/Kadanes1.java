// PROGRAM NO 9
// PRINT MAXIMUM SUNARRAYS 
// USING KADANES ALGORITHIM

package ARRAYS.Maxi_subarray;

public class Kadanes1 {
 public static void kadanes(int number[]){
  int currSum = 0;
  int maxSum = Integer.MIN_VALUE;
  for(int i=0; i<number.length; i++){
    currSum += number[i];
    if(currSum < 0){
      currSum = 0;
    }
    maxSum = Math.max(maxSum, currSum);
  }
  System.out.println("maximim sum is = " +maxSum);
}
public static void main(String[] args) {
  int number[] = {3,-2,5,-1,-6,7,-9};
  kadanes(number);
} 
    
}
