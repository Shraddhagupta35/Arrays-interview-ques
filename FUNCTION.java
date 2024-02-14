/* write a program java to implement the factorial with using function and return factorial. */
// import java.util.Scanner;

import java.util.Scanner;

public class FUNCTION {
  /* program no :- 1
    public static int calculateFact(int n){
        int fact = 1;
        for(int i=1; i<=n; i++){
            fact = fact*i;
        }
        return fact;
    }
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        System.out.println("enter your Number:");
       int a = sc.nextInt();
       sc.close();

       // calculateFact(n);
      System.out.println("factorial number is:" +calculateFact(a) ); 
        
    }     */

    // write a program to implement binomial coefficent.

/*   PROGRAM NO :- 2

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
      */ 
      
      
      // PROGRAM NO :- 3
    
      /* 
      public static boolean isPrime(int n){
        boolean isPrime = true ;
        for(int i=2; i<=Math.sqrt(n); i++){
            if( n % i == 0){
                System.out.println("notPrime");
            } 
        }                        
        return isPrime;
      }

    public static void main(String[] args) {
        
        isPrime(5);
    } */


     // PROGRAM NO :- 4
    
     // find the average of 3 number
/* 
    public static double calculateAverage(Double a, Double b , Double c){
        double average = (a + b + c)/ 3;
        return average;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your number:");
        double a = sc.nextInt();
        double b = sc.nextInt();
        double c = sc.nextInt();
        
        sc.close();
       double total= calculateAverage(a,b,c);
       System.out.println("the average number is = " +total);
    } */
       

      // PROGRAM NO :- 5

    /*  Write a method named isEven that accepts an int argument. The method should return true if the argument is 
            even, or false otherwise. Also write a program to test your method. */

   /*  public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("enter your number pass");
         int num = sc.nextInt();
         sc.close();
         if(isEven(num)){
            System.out.println("number is even = " +num);
         }else{
            System.out.println("number is odd = " +num);
         }

    }

    public static boolean isEven(int number){
        if(number % 2 == 0){
            return true;
        }else{
            return false;
        }
    } */


    // PROGRAM NO :- 6

    // to  check a palindrome number.

   /*  public static boolean CheckPalindrome(int n){
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
        */

       // SUM OF INTEGER NUMBER.
       // PROGRAM := 7

/*         public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Input an integer: ");
            int digits = sc.nextInt();
            sc.close();
            System.out.println("The sum is " + sumDigits(digits));
            }

            public static int sumDigits(int n) {
            int sumOfDigits = 0;

            while(n > 0) {

            int lastDigit = n % 10;
            sumOfDigits += lastDigit;
            n /= 10;

            }
            return sumOfDigits;
            } */
       
            // PROGRAM NO :- 8

    // WRITE A PROGRAM TO PRINT SUM OF ODD NUMBER 1 TO N.
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
