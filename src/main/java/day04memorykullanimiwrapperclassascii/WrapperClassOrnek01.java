package day04memorykullanimiwrapperclassascii;

import java.util.Scanner;

public class WrapperClassOrnek01 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name please");
        String username = input.next();
        System.out.println(username);



        Scanner input2 = new Scanner(System.in);
        System.out.println("lutfen yasinizi giriniz");
        int age = input2.nextInt();
        System.out.println(age);


        Scanner input3 = new Scanner(System.in);
        System.out.println("lutfen kilonuzu giriniz");
        byte height = input3.nextByte();
        System.out.println(height);


        Scanner input4 = new Scanner(System.in);
        System.out.println("lutfen boyunuzu giriniz");
        double length = input4.nextDouble();
        System.out.println(length);



        Scanner input5 = new Scanner(System.in);
        System.out.println("Spora kac ay geleceksiniz?");
        byte mounth = input5.nextByte();
        System.out.println(mounth);




    }
}
