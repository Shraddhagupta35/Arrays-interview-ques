package OOPS;

public class Copy_constructor {

                           // not clear concept
         public static void main(String[] args) {
        Student s1 = new Student("dfh");
        s1.name = "mohan";
        s1.rollno = 23;
        s1.password = "absd";

        Student s2 = new Student(s1);
        s2.password = "dfre";
        System.out.println(s2.name);
        System.out.println(s2.password);
        

        
      }
    }

    class Student{
      String name ;
       int rollno;
       String password;
       int marks[];

    
      Student(Student s1 ){
         marks = new int[3];
        this.name = s1.name;
        this.rollno = s1.rollno;
        this.password = s1.password;
        marks = new int[3];
      }

      Student (String name ){
        this.name = name;
        
      } 
    } 

     