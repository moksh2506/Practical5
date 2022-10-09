package com.company;
import java.io.*;

public class pr5_4 {
    public static void main(String[] args) {
        FileInputStream in = null;
        FileOutputStream out = null;
        try {
            in = new FileInputStream("InputFile.txt");
            out = new FileOutputStream("OutputFile.txt");
            int temp;
            while ((temp = in.read()) != -1) {
                out.write(temp);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (in != null) {
                try {
                    in.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (out != null) {
                try {
                    out.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        System.out.println("You are Passed.. Enjoy!!");
        System.out.println("This program is prepared by 21CE099_Moksh:))");
    }
}
