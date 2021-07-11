package in.stack.bala.filehandling;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        try {
//            char[] data=FileUtils.readFile("employee.txt");
//            System.out.println("Content "+data);
            FileUtils.readLines("employee.txt");


        } catch (Exception e) {
            e.printStackTrace();
        }
//
//        String data= scan.nextLine();
//        try {
//            FileUtils.writeFile("myfile.txt",data);
//
//        }catch (Exception e){
//            e.printStackTrace();
//        }


    }
}
