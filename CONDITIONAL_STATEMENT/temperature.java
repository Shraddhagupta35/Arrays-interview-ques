/* finish the following code so that if print you have a fever if your temperature is above
    100 and otherwise prints you don't have a fever.
 */

package CONDITIONAL_STATEMENT;
import java.util.Scanner;

public class temperature {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
 System.out.println("enter your number:");
double temp = sc.nextDouble();
                
sc.close();
    if(temp>100){
      System.out.println("temperature is high then  fever");
     }else{
         System.out.println("not fever");
     }
    }    
}

    

