/* write a program to print sum of 2 number without parameter. */
package FUNCTION;
import java.util.Scanner;
public class Sum_fun {

    // not parameter

   /*  public static void CalculateSum(){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of a:");
        int a = sc.nextInt();
        System.out.println("enter the number of b:");
        int b = sc.nextInt();
        sc.close();
        int sum = a+b;
        System.out.println("sum is of a and b:" +sum);
    }

    public static void main(String[] args) {
        CalculateSum();
    }

    */

  // with parameter
 public static int add(int num1, int num2) {

    int sum = num1 + num2;
    return sum;
    
}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();
        int sum = add(a , b);
        System.out.println(sum);
    }

}


    
