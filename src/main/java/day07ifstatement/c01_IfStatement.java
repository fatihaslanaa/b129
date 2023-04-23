package day07ifstatement;

import java.util.Scanner;

public class c01_IfStatement {
    public static void main(String[] args) {




        //if it rains , I will cancel the picnic



        //Example 1) Verilen character buyuk harf ise ekrana "Buyuk Harf" yazdiran kodu olusturunuz

        char ch = 'G';

        if(ch>='A' && ch <='Z'){
            System.out.println("Buyuk Harf");


        }// if body
        // Ex 2) Verilen bir sayi cift ise ekrana cift sayi yazdiran kodu olusturunuz

         byte sayi =20;// tek sayi yazarsak calismaz // eksi arti fark etmez


        if(sayi%2==0){//%2 bolum 2 kalan 0 i verir.
            System.out.println("Cift Sayi");//cift sayi verdirmek icin


        }



        //Ex3 Verilen bir sayi 300 den kucuk  veya
        // 1200 den buyuk ise ekrana "Harika Sayi"
        // yazdiran kodu giriniz

            int num = 229;
        if(num<300 || num>1200){
            System.out.println("Harika Sayi");
        }//if Body


        int num1 = 500;
        if(num1<300 || num1>1200){
            System.out.println("yesss");
        }


        //Ex4) Kullanicidan alinan bir sayinin tek mi
        // cift mi oldugunu yazdiran kodu olusturunuz

        //1.yol

        Scanner input =new Scanner(System.in);
        System.out.println("lutfen bir sayi giriniz");

        int num3 = input.nextInt();

        //burada iki kontrol yapildi

        if(num3%2 ==0){
            System.out.println("cift sayi");

        }
        if(num3%2!=0){
            System.out.println("tek sayi");

        }
        //2.yol
        if(num3%2==0){
            System.out.println("Cift Sayi");

        }else {    // else diger tum ihtimaller

            //burada conditional yok tek kontrol var

            //bu javaya az is yaptiir
            System.out.println("tek sayi");

        }


        //Ex 5 Verilen bir sayinin negatif pozitif
        // yada notr oldugunu soyleyen kodu yaziniz

          int numara = 0;

        if(numara<0){
            System.out.println("negatif sayi");
        }else if(numara ==0){
            System.out.println("notr sayi");
        }else {
            System.out.println("pozitif sayi");
        }















    }//main


}//class body
