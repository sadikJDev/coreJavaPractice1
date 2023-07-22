
package file;

import java.io.File;
import java.util.Scanner;

public class Readfile {
    public static void main(String[] args) {
        try {
            File file = new File("D:/idb/My Folder/iqbal.txt");
            Scanner input = new Scanner(file);
            
            
            while(input.hasNext()){
                String id = input.next();
                String name = input.next();
                System.out.println("Id : " + id + " Name : " + name);
            }
            
            input.close();
            
            
            
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
