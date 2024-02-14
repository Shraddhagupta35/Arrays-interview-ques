package LOOP;

import java.util.Scanner;

public class khushi {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your number:");
        int i = sc.nextInt();
        double d= sc.nextDouble();
        String s = "";
        //s = sc.next();
        //sc.close();
         
        while(sc.hasNext()){
            s = sc.nextLine();
            sc.close();
        }
            System.out.println(s);
            System.out.println(d);
            System.out.println(i);
            
        
    }
    
}

    

