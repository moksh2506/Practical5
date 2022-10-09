package com.company;
import java.io.*;

public class pr5_5 {
    public static void main(String[] args) throws IOException {
        DataInputStream inputStream = null;
        DataOutputStream outputStreamEven = null;
        DataOutputStream outputStreamOdd = null;
        try {
            inputStream = new DataInputStream(new BufferedInputStream(new FileInputStream("src/input.txt")));
            outputStreamEven = new DataOutputStream(new BufferedOutputStream(new FileOutputStream("src/even.txt")));
            outputStreamOdd = new DataOutputStream(new
                    BufferedOutputStream(new FileOutputStream("src/odd.txt")));
            String textinput;
            double doublenumber;
            int number = inputStream.readInt();
            textinput = inputStream.readUTF();
            doublenumber = inputStream.readDouble();
            while ((number = inputStream.read()) % 2 != 0) {
                outputStreamOdd.writeInt(number);
                outputStreamOdd.writeUTF(textinput);
                outputStreamOdd.writeDouble(doublenumber);
            }
            while ((number = inputStream.read()) % 2 == 0) {
                outputStreamEven.writeInt(number);
                outputStreamEven.writeUTF(textinput);
                outputStreamEven.writeDouble(doublenumber);
            }
        } finally {
            if (inputStream != null) {
                inputStream.close();
            }
            if (outputStreamEven != null) {
                outputStreamEven.close();
            }
            if (outputStreamOdd != null) {
                outputStreamOdd.close();
            }
        }
    System.out.println("This program is preared by 21CE099_Moksh.");
    }
}
