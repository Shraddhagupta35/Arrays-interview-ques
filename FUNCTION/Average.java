// find the average of 3 number
package FUNCTION;
import java.util.*;

public class Average { 
    public static double calculateAverage(Double a, Double b , Double c){
        double average = (a + b + c)/ 3;
        return average;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your number:");
        double a = sc.nextInt();
        double b = sc.nextInt();
        double c = sc.nextInt();
        
        sc.close();
       double total= calculateAverage(a,b,c);
       System.out.println("the average number is = " +total);
    }     
}
