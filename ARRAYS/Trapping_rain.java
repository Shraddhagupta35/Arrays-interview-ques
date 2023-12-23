// PROGRAM NO 10 
// TO PRINT TRAPPING RAINWATER
package ARRAYS;

public class Trapping_rain {
   

public static int gettrappedranning(int height[]){
  int n = height.length;


  // calculate max left boundary
   int max_left[] = new int[n];
   max_left[0] = height[0];
   System.out.println( "maximum left boundary array : " +  max_left[0] );   // index 0 maximum 
   for(int i=1; i<=n-1; i++){
    max_left[i] = Math.max(height[i] , max_left[i-1]);

    System.out.print( max_left[i] + " "); 
   }

   System.out.println();


   // calculate max right boundary
   int max_right[] = new int[n];
   max_right[n-1] = height[n-1];
   System.out.println("maximum right boundary array : " + max_right[n-1]);
   for(int i=n-2; i>=0; i--){
    max_right[i] = Math.max(height[i] , max_right[i+1]);
    System.out.print (max_right[i] + " " );
   }
   System.out.println();

   int trapping_rainwater = 0;
   // use loop
   for(int i=0; i<n; i++){


    // calculate water level
     int waterlevel = Math.min(max_left[i] , max_right[i]);
     

      // calculate trapping rainwater = waterlevel - height
      trapping_rainwater += (waterlevel - height[i] );
   }
   return trapping_rainwater;
  
}
public static void main(String[] args) {
  int height[] = { 3, 8,6,2,7,4,0,5};
  System.out.println("the trapping rainwater is store : " + gettrappedranning(height));
} 
    
}
