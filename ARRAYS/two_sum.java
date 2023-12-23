/*Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.
Example 1:

Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].

  */

package ARRAYS;

public class two_sum {
    public static int twosum(int n[] , int target){
        int ans[] = new int[2];
        for(int i=0; i<n.length; i++){
            for(int j=i+1; j<n.length; j++){
                 if(n[i]+ n[j] == target){
                    ans[0] = i;
                    ans[1] = j;
                 }
            }  
        }
        return ans[2];
    }
    public static void main(String[] args) {
       // int Arrays;
        int arr[] = {2,7,11,15};
        System.out.println( twosum(arr, 9));
       
     //   System.out.println( Arrays.toString((twosum(arr, 9))));

     // error
    }
    
}
