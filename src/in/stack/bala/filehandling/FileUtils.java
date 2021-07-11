package in.stack.bala.filehandling;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class FileUtils {
    public static File createNewFile(String path){
        File file=new File(path);
        try{
            //creating the new file
            boolean isFileCreated=file.createNewFile();

        } catch (IOException e) {
            e.printStackTrace();
        }
      return file;
    }

    public static void writeFile(String path,String data)throws Exception{
        FileWriter fw=  new FileWriter(path);
        fw.write(data);
        System.out.println("Data Written to the file!");
        fw.close();

    }

    public static char[] readFile(String path)throws Exception{
        FileReader fr=new FileReader(path);
        char data[]=new char[1000];
        fr.read(data);
        fr.close();
        return data;
    }


     public static void readdataASChar(String path)throws Exception {
         FileInputStream fis=new FileInputStream(path);
         BufferedInputStream bis=new BufferedInputStream(fis);
         int linecount=bis.read();
         while(linecount!=-1){
             System.out.println((char)linecount);
             linecount=bis.read();
         }
         bis.close();


     }



    public static void readLines(String path)throws Exception {
//        char content[]=new char[1000];
//      FileReader file=new FileReader(path);
//      BufferedReader input=new BufferedReader(file);
//
//      input.read(content);
//        System.out.println("Content"+ Arrays.toString(content) );
//        input.close();

        File file=new File(path);
        Scanner scan=new Scanner(file);
        while(scan.hasNextLine()){
            //System.out.println("Line :"+scan.nextLine());
           String employee[] =stringSplitter(scan.nextLine());
            System.out.println("Empolyee Name :  "+employee[1]);
        }
        scan.close();


    }

    public static String[] stringSplitter(String content){
        String[] arrOfStr = content.split(" ");
        return arrOfStr;
    }


}
