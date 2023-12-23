// PROGRAM NO 5
// TO PRINT PAIR OF ARRAY

package ARRAYS;

public class Pair_array {
    
public static void printpair(int number[]){
    int tp = 0 ;  // iska use total pair ko nikalne ke liye kr rhe h
      for(int i=0; i<number.length; i++){
        int curr = number[i];  // ye 2 4 6 8 10 ko print krega
        for(int j=i+1; j<number.length; j++){ // ye 4 6 8 10 ko print krega phir pair mai convert kr dega i+1 ka mtlb index 1 start hoga
          System.out.print ("(" + curr + ","  + number[j] + ") " ); // agr ")" aise krenge to gap nhi hoga pair ke bich mai aur ") " to gap hoga kya logic hai 
          tp++;
        }
        System.out.println();
      }
      System.out.println("the total pair is :" +tp);
    }
public static void main(String[] args) {
  int num[] = { 2,4,6,8,10};
  System.out.println("the given array:");
  for(int i=0; i<num.length; i++){
    System.out.print(num[i] + " ");
  }
  System.out.println();
  System.out.println("after array in pair : ");

   printpair(num);
}   



    
}
