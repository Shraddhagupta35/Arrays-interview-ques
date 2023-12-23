// PROGRAM NO 7
// to print maximum subarray and add the subarrays
// BRUTE FORCE ALGORITHIM

package ARRAYS.Maxi_subarray;

public class Brute_force {
 public static void printsubarraymax(int subnumber[]){
    int current =0;
    int maximum = Integer.MAX_VALUE;
        for(int i=0; i<subnumber.length; i++){
            int start = i;
            for(int j=i; j<subnumber.length; j++){
              int end = j;
              current = 0;
              for(int k=start; k<=end; k++){
                current = current + subnumber[k];
               
              }
              System.out.println(current + " ");
              if(maximum < current){
                  maximum = current;
              }
                //  System.out.println();  
          }
        }
         System.out.println( "maximum = " + maximum);
        }
        public static void main(String[] args) {
          int number[] = {2,1,-3,4,-5,6};
        
          printsubarraymax(number);
   } 
            
}
        
    

