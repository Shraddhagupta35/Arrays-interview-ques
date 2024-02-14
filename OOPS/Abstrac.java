package OOPS;

public class Abstrac {
    public static void main(String[] args) {

        Horse h = new Horse();
        h.walk();
        h.eat();
        h.changecolor();
       }
    }

       abstract class Animals{
        String color;
        String hair;

        Animals(){
           this.color = "red";
           this.hair = "black";

        }

        void eat(){    // non abstract function
          System.out.println("all animal are eat food");
        }

        abstract void walk();   // not implementation because abstract class doed not implementation
       }

       class Horse extends Animals{

          void changecolor(){
           String color = "black";
            System.out.println(color);
          }

        void walk(){
          System.out.println("horse are walking on 4 legs");
        }
       

    
}
