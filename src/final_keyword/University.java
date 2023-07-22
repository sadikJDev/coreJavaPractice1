
package final_keyword;


public class University {
    final String UNIVERSITY_NAME = "BU";
    static final int fees;
     
     static{
         fees = 4400;
     };
     
     void display () {
         System.out.println(UNIVERSITY_NAME);
         System.out.println(fees);
}
}


