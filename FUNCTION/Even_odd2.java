package FUNCTION;

import java.util.Scanner;
                                  // problem of this code

public class Even_odd2 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num ;
        int evenSum = 0;
        int oddSum = 0;

        do{
            System.out.println("enter your number:");
            num = sc.nextInt();
            sc.close();

            if(num % 2 == 0){
                
                System.out.println("sum of evenSum = " + evenSum);
              
            }else{
                
                System.out.println("sum of oddSum = " + oddSum);
               
            }
        }
          while(evenSum == evenSum + num && oddSum == oddSum + num);
    } 
    
}
