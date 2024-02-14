// write a program to implement binomial coefficent.

package FUNCTION;
import java.util.Scanner;

public class Binomial_coffi {
    public static int factorial(int n){
    int fact = 1;
    for(int i=1; i<=n; i++){
        fact = fact *i;
    }
    return fact;
    }
    public static int coefficent(int n ,  int r){


        int n_fact = factorial(n);
        int r_fact = factorial(r);
        int nmr_fact = factorial(n-r);

        int Binomial_coefficent = n_fact / (r_fact * nmr_fact) ;

        return Binomial_coefficent ;
        
        
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

    
        sc.close();

        int Binomial = coefficent( a ,b);
        System.out.println(Binomial);
    }   
}
