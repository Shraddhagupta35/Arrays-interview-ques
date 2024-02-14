// to  check a palindrome number.
package FUNCTION;
import java.util.Scanner;

public class Palindrome {
  public static boolean CheckPalindrome(int n){
        int temp = n;
        int reverse = 0;
        while(n>0){
            int lastDigit = n % 10;
            reverse = reverse * 10 + lastDigit;
            n = n / 10;
           
        }
        if(temp == reverse){
            return true;

        }
            return false;
        
        }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("enter the number :");
            int a = sc.nextInt();
            sc.close();
            if(CheckPalindrome(a)){
                System.out.println("number is palindrome = " +a);
            }else{
                System.out.println("number is not pAlindrome = " +a);
            }
        }
    
}
