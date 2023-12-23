// PROGRAM NO 9.2 AND 9.3
package ARRAYS.Maxi_subarray;

public class Kadanes2_3 {

    
 public static void getkadanes(int num[]){
    int curr = 0;
   int minSum = Integer.MAX_VALUE;
    for(int i=0; i<num.length; i++){
      curr += num[i];
      if(curr > 0){  // > iska use krenge to mimimum value dega aur < isko use kre to 0 ans dega 
        curr =0;
  
      }
      minSum = Math.min(minSum , curr);
    }
    System.out.println("minimum value is = " +minSum);  
  }


  // main function
  public static void main(String[] args) {
  
    int num[] = {-1, -2,-3,-4,-5};
    getkadanes(num);
 
} 
  
    
}
