package OOPS;

public class Static {
                    // static keyword

//                     issue code

    public static void main(String[] args) {
      Students s1 = new Students();
     s1.name = "buttuk";
     s1.rollno = 3;
     Students.schoolname = "ITM";

      System.out.println(s1.name );
      System.out.println(s1.rollno);
     
       Students s2 = new Students();
       s2.name = " mohan";
       System.out.println(Students.schoolname);
       

       Students s3 = new Students();
       Students.schoolname = "abs";
       s3.rollno = 4;
       System.out.println(Students.schoolname);
      } 
    }
    
    class Students{
      String name;
      int rollno;

      static String schoolname ;

      void setname(String name){
        this.name = name;
      }
      
    } 
                                                     // OR 
/* 
    public static void main(String[] args) {

      Students s1 = new Students();
      s1.schoolname = "JVM";

      Students s2 = new Students();
      System.out.println(s2.schoolname);
      
    }
}

    class Students{

      String name; 
      int roll;


      static String schoolname;


      void setname(String name){
        this.name = name;
      }


      String getname(){
        return this.name;
      }
    } 
  */

    
    

