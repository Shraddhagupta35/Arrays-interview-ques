package LOOP;

public class palindrome_num {
    public static void main(String[] args) {
        
        int n = 121 ;
        int sum = 0;
        int m = n;
      while(n>0){
          int r = n%10;
          sum  = sum + r;
          n = n/10;
      }
  
          if(m==sum){
              
              System.out.println("its palindrome mumber: " );
          }else{
              System.out.println("not palindrome");
          }
      }   
  }
    

