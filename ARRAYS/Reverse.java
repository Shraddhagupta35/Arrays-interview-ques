//  PROGRAM NO 4
// PRINT THE REVERSE ARRAYS.
    
package ARRAYS;

public class Reverse {

    public static void reversearray( int numbers[]){
      int firstno = 0 , lastno = numbers.length - 1; 
      while(firstno < lastno ){
         int temp =  numbers [lastno];
        numbers[ lastno ] =  numbers [firstno];
          numbers[firstno] = temp;

         firstno ++;
         lastno --;
      }
    }
    public static void main(String[] args) {
       int number[] = {2,4,6,8,10,12,14,16};
       System.out.println("before array is :");

      for(int i=0; i<number.length; i++){

      System.out.print(number[i] + " ");   

      } 
       System.out.println();


    reversearray(number);  
    System.out.println( "after reverse number :" );

     for(int i=0; i<number.length; i++){
      System.out.print( number[i] + " ");
    }
    System.out.println();
  }

    
}
