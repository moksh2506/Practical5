package com.company;
import java.lang.*;
import java.io.*;

public class pr5_2 {
    public static void main(String[] args) throws IOException{
        FileReader source = null;
        try {
            source = new FileReader("D:\\JavaPrograms\\generatedFile1.txt");
            int temp;
            while ((temp = source.read()) != -1)
                System.out.println((char) temp);
            System.out.println("Successfully Over.");
            System.out.println("This program is prepared by 21CE099_Moksh..");
        }
        finally {
            if (source != null)
                source.close();
        }

    }
}
