public class Hierarchical_inheritance {
                                     // HIERARCHICAL INHERITANCE
 
       public static void main(String[] args) {

        bird b = new bird();
        b.eats();
        


       }
    }
     class Animals{

      void eats(){
        System.out.println("all animals and human  are eat food");
      }

      void breathe(){
        System.out.println("all aniamls and human are breathe ");
      }
     }

     class  mammal extends Animals{

      void walk (){
        System.out.println("human are walking on the anywhere");
      }
     }

     class Fish extends Animals{

      void swing(){
        System.out.println("fish are swing in the river");
      }
      
     }

     class bird extends Animals{

      void fly(){
        System.out.println("birds are fly in the sky");
      }
     } 

    
