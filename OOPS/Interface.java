package OOPS;

public class Interface {
    public static void main(String[] args) {
        cat c = new cat();
        c.eats_non_veg();
        c.eats_veg();
        
      } 
    }
      
      interface Carnivores{
        void eats_non_veg();  // not implementation write because we writes abstract
      }

      interface Herbivores{
        void eats_veg();  // not implementation  write we writes abstract
      }

      class cat implements Carnivores , Herbivores{

        public void eats_non_veg(){
          System.out.println("cat eats some food chicken , meat");
        }

        public void eats_veg(){
          System.out.println("cat are eats veg food");
        }

      } 
    

