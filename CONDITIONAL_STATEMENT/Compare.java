package CONDITIONAL_STATEMENT;

import java.util.Scanner;

public class Compare {
    public static void main(String[] args) {
        Scanner rabbit = new Scanner(System.in);
        System.out.println("enter your number:");
        int n1 = rabbit.nextInt();
        System.out.println("enter your number:");
        int n2 = rabbit.nextInt();
        rabbit.close();

        if(n1 > n2){
            System.out.println("hello");
        }else if(n2 == n1){
            System.out.println("hii piii");
        }else if(n1 <= n2){
            System.out.println("hii rabbit");
         } else{
                System.out.println("rabbit is bore!");
            }
        }
    }


