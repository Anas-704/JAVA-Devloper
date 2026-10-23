package com.Anas;

import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {
        System.out.println("TypeCasting");

        Scanner input = new Scanner(System.in);

//        System.out.print("Enter number : ");
//        float num = input.nextFloat();
//        System.out.println(num);
//
//        // TypeCasting : means converting or compressing a bigger number into smaller number ;
//        int no = (int)(63.58f);
//        float number = (float)(5689746534646556L);
//        System.out.println(no + "\n" + number);

        //automatic type promotion in expression
//        int x = 257;
//        byte y = (byte)(x);
//        System.out.println(y);
//
//        byte a = 60;
//        byte b=40;
//        byte c = 10;
//        int d = a*b/c;
//        byte e = (byte)(d);
//        System.out.println(d +"\n" + e);

        byte b= 68;
        short s = 200;
        char a = 'c';
        int i = 540;
        float f= 52.36f;
        double d = 897456.23564;

        double result = (f*b) + (i/a) + (d-s);
        // floar + integer + double = double ;
        System.out.println((f*b) + " " + (i/a) + " " + (d-s));
        System.out.println(result);



    }
}
