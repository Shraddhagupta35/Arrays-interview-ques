/*  Write a method named isEven that accepts an int argument. The method should return true if the argument is 
            even, or false otherwise. Also write a program to test your method. */

package FUNCTION;
import java.util.Scanner;

public class Even_odd {
 public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("enter your number pass");
         int num = sc.nextInt();
         sc.close();
         if(isEven(num)){
            System.out.println("number is even = " +num);
         }else{
            System.out.println("number is odd = " +num);
         }

    }

    public static boolean isEven(int number){
        if(number % 2 == 0){
            return true;
        }else{
            return false;
        }
    } 

    
}
