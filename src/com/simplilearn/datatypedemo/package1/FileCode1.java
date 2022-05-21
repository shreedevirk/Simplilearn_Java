package com.simplilearn.datatypedemo.package1;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.List;

public class FileCode1
{
    public static void main(String[] args) throws IOException
    {
//        createFileUsingFileClass();
//       createFileUsingFileOutputStreamClass();
        createFileIn_NIO();
    }
 
    private static void createFileUsingFileClass() throws IOException
    {
          File file = new File("D://Files//testFile1.txt");
  
          //Create the file
          if (file.createNewFile()==true){
            System.out.println("File is created!");
          }else{
            System.out.println("File already exists.");
          }
 /*          
          //Write Content
          FileWriter writer = new FileWriter(file);
          writer.write("Test data 14-05-22");
          writer.close();
    }
    
private static void createFileUsingFileOutputStreamClass() throws IOException
    {
        String data = "Test data";
        FileOutputStream out = new FileOutputStream("D://Files//testFile2.txt");
        out.write(data.getBytes());
        out.close();
    }

private static void createFileIn_NIO()  throws IOException
    {
        String data = "Test data";
        Files.write(Paths.get("D://Files//testFile3.txt"), data.getBytes());
        List<String> lines = Arrays.asList("1st line", "2nd line");
       Files.write(Paths.get("D://Files//file6.txt"),
                    lines,
                    StandardCharsets.UTF_8,
                    StandardOpenOption.CREATE,
                    StandardOpenOption.APPEND);
    }*/
}
}
