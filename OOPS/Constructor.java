package OOPS;

public class Constructor {
    public static void main(String[] args) {
        Snacks s1 = new Snacks();
        s1.snacks_name = "samoshe";
        s1.price = 10;
        s1.piece = 2;
        System.out.println(s1.snacks_name + " " + s1.price + " " + s1.piece);
  
  
        Snacks s2 = new Snacks("dhosha" , 15, 3);
        System.out.println(s2.snacks_name );
        System.out.println(s2.price);
        System.out.println(s2.piece);  
      }
    }
  
      class Snacks{
        String snacks_name;
         int price ;
         int piece;
  
         Snacks(){
  
         }
  
          Snacks(String snacks , int price , int piece){
          this.snacks_name = snacks;
          this.price = price;
          this.piece = piece;
  
        }
      
    
}
