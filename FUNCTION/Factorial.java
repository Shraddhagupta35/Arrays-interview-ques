/* write a program java to implement the factorial with using function and return factorial. */

package FUNCTION;
import java.util.Scanner;

public class Factorial {
 public static int calculateFact(int n){
        int fact = 1;
        for(int i=1; i<=n; i++){
            fact = fact*i;
        }
        return fact;
    }
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        System.out.println("enter your Number:");
       int a = sc.nextInt();
       sc.close();

       // calculateFact(n);
      System.out.println("factorial number is : " +calculateFact(a) ); 
        
    }   
    
}
