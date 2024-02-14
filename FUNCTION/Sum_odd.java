// WRITE A PROGRAM TO PRINT SUM OF ODD NUMBER 1 TO N.
package FUNCTION;

import java.util.Scanner;

public class Sum_odd {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("enter your number :");
        int n = sc.nextInt();
        sc.close();
        
        isOdd(n);
    }  
        

      
public static void isOdd(int n){
    int sum = 0;
    for(int i=1; i<=n; i++){
        if(i % 2 != 0)
        sum = sum + i;
            System.out.print(sum+ " ");
    }
}
}

    

