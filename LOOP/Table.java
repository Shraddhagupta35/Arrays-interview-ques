package LOOP;

import java.util.Scanner;

public class Table {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your number:");
    int n = sc.nextInt() ;
    sc.close();
   // int result ;
    for(int i = 1; i<=10; i++){
        
        System.out.println(n+ " x "  +i+ " = " +(n*i));
    }
} 
    
}

    

