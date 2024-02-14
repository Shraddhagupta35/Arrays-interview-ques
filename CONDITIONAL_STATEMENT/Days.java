package CONDITIONAL_STATEMENT;

import java.util.Scanner;

public class Days {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your number:");
        int week = sc.nextInt();
        sc.close();
        switch(week){
            case 1:
                  System.out.println("MONDAY");
                  break;
            case 2:
                  System.out.println("TUESDAY");
                  break;
            case 3:
                  System.out.println("WEDNESDAY");
                  break;
            case 4:
                 System.out.println("THRUSDAY");  
                 break;
            case 5:
                 System.out.println("FRIDAY");
                 break;
            case 6:
                 System.out.println("SATURDAY");              
                 break;
            case 7:
                 System.out.println("SUNDAY");
                 break;     
        }
    }
    
}

