package FUNCTION.Number_System;
import java.util.Scanner;

public class Dec_to_Bin{
     public static void DecToBin(int DecNum){
     int myNum = DecNum;
        int pow = 0;
        int BinNum = 0;

        while(DecNum >0){
            int Digit = DecNum % 2;
            BinNum = BinNum + Digit *(int) Math.pow(10,pow) ;
            pow++;
            DecNum = DecNum / 2;

        } 
        System.out.println("Decimal number is "  +myNum+ " =" + BinNum);
           
    }
          public static void main(String[] args) {
            
        
            Scanner sc = new Scanner(System.in);
            System.out.println("enter your number:");
            int a = sc.nextInt();
            sc.close();
            DecToBin(a);
        }
    }

