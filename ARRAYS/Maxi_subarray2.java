// PROGRAM NO 8 
// TO PRINT MAXIMUM SUBARRAYS USE TECHNIQUE
// PREFIX SUM ALGORITHIM


package ARRAYS;

public class Maxi_subarray2 {
public static void maxsubarray(int number[]){
  int curr = 0; 
  int maximum = Integer.MIN_VALUE;
   int prefix[]  =  new int[number.length];
   prefix[0] = number[0];
   for(int i=1; i<number.length; i++){
    
    prefix[i] = prefix[i-1] + number[i];
      }
  for(int i=0; i<number.length; i++){
      int start = i;
      for(int j=i; j<number.length; j++){
        int end = j;
        curr =  start == 0 ? prefix[end] : prefix[end] - prefix[start-1];
       // System.out.println("curr is" + curr);
        if(maximum < curr ){
          maximum = curr ;
        }

      }
  } 
  System.out.println("maximum is = " + maximum);
}
public static void main(String[] args) {
  int number[] = {2 , -3 ,4,-5,-2,9, -6};
  maxsubarray(number);
} 
    
}
