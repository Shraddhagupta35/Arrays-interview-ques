package FUNCTION.Number_System;

import java.util.Scanner;

public class Bin_to_Dec {
    public static void BinToDec(int binNum){
        int myNum = binNum;
        int pow = 0;
        int decNum = 0;

        while (binNum > 0){

        int lastDigit = binNum % 10;
         decNum = decNum + lastDigit * (int)Math.pow(2,pow);
        pow++;
        binNum = binNum / 10;

        }
         System.out.println("Binary number is "  +myNum+ " = " + decNum);

    }
      
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter your number:");
        int a = sc.nextInt();
        sc.close();
        BinToDec(a);
    }
    
    
}
