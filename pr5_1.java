package com.company;
import java.io.*;

public class pr5_1 {
    public static void main(String[] args) {
        String path = "";
        boolean bool ;
        try {
            File file = new File("generatedFile1.txt");
            file.createNewFile();
            System.out.println(file);
            File file2 = file.getCanonicalFile();
            System.out.println(file2);
            bool = file2.exists();
            path = file2.getAbsolutePath();
            System.out.println(bool);
            if (bool) {
                System.out.println(path + " Exists? " + bool);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("This program is prepared by 21CE099_Moksh..");
    }
}
