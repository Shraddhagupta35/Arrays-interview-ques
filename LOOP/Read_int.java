// Write a Java program that reads an integer between 0 and 1000 and adds all the digits in the integer. 
package LOOP;    
import java.util.Scanner;
                                 // issue code

public class Read_int {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value:");
        int n = sc.nextInt();
        int remainder = sc.nextInt();
        int sum = 0;
            sc.close();
        while(n > 0){
             
            remainder = n % 10;
             sum = sum + remainder ;
            n = n/10;
             }

             System.out.println("sum of Digit = " +sum);
             

    }
    
} 
    
