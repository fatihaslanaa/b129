package day03scanner;

import java.util.Scanner;

public class C03_Scanner {

    public static void main(String[] args) {

        // Ex 1) Kullanicidan sayilari alarak toplama islemi yaptiran kodu yaziniz


        Scanner input = new Scanner(System.in);

        //2.Adim kullaniciya ne yapacagini soyle
        System.out.println("Lutfen toplanacak olan ilk sayiyi giriniz");

        //3. Adim  Kullanicidan aldiginiz datayi variable icine koyun

        double sayi1= input.nextDouble();
        System.out.println("Lutfen toplanacak olan ilk sayiyi giriniz");

        double sayi2= input.nextDouble();
        System.out.println("Toplam"+(sayi1+sayi2));







    }


}
