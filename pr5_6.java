    package com.company;

    public class pr5_6 {
        public static void main(String[] args) {
            int a=10;
            double b = 5.55;
            Integer intobj = Integer.valueOf(a);
            Double doubleobj = Double.valueOf(b);
            if (intobj instanceof Integer) {
                System.out.println("An object of Integer is created.");
            }
            if (doubleobj instanceof Double) {
                System.out.println("An object of Double is created.");
            }
            System.out.println("This program is prperaed by 21CE099_Moksh:))");
        }
    }
