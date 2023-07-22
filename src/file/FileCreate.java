
package file;

import java.io.File;
import java.io.IOException;

public class FileCreate {
    public static void main(String[] args) throws IOException {
        File dir = new File("D:/idb/My Folder");
        dir.mkdir();
        String pathLocation = dir.getAbsolutePath();
        System.out.println(pathLocation);
//        String pathLocation = dir.getCanonicalPath();
//        System.out.println(pathLocation);

        System.out.println(dir.getName());
//        dir.getName();
//        if(dir.delete()){
//            System.out.println(dir.getName() + " the folder has bees deleted.");
//        }
//
       File file1 = new File(pathLocation +  "/iqbal.txt");
       File file2 = new File(pathLocation + "/shaheen.txt");
       
       try{
       file1.createNewFile();
       file2.createNewFile();
           System.out.println("Files are created.");
//       D:\idb\My Folder
       }catch(IOException e){
           System.out.println(e);
       }
       
//       file2.delete();
//       if (! file2.exists()){
//           System.out.println(! file2.createNewFile() + " This file is exist.");
//       }else{
//           System.out.println(file2.createNewFile() + " This file is not exist.");
//       }
       
       
       
       
    }
    
}
