
package this_keyword;

public class Person {
     String name;
     int age;
     String hareColor;
     
     Person( String name, int age){
         this.name = name;
         this.age = age;
     }
     
     Person (String name, int age, String hareColor){
         this(name, age);
         this.hareColor = hareColor;
     }
     
     void displayInformation(){
         System.out.println("Name : " + name );
         System.out.println("Age : " + age);
         System.out.println("Hare Color : " + hareColor);
         System.out.println("\n");
     }
}
