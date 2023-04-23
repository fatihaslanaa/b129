package day08nestetif;

import java.util.Scanner;

public class C03_NestedIf {

    /*
    Kullanicidan 0'dan kucuk 120'den buyuk deger giremeyecek sekilde datalari aldiktan sonra
    Eger calisan kadinsa 60 yasindan buyukse Emekli Olabilir yazdirin
    Eger calisan erkek ise 65 yasindan buyukse "Emekli Olabilir" yazdiran kodu olsuturunuz
     */


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen cinsiyetinizi giriniz \nKadin icin K harfi \nErkek icin E harfi giriniz");

        char cinsiyet = input.next().toUpperCase().charAt(0);//kullancn verdg harf i kucuk harfe cevirdim

        System.out.println("Lutfen yasinizi giriniz");

        int yas = input.nextInt();

        if (cinsiyet == 'K') {//outer if
            if (yas < 0 || yas > 120) {
                System.out.println("lutfen girdiginiz yas degerini kontrol ediniz");
            } else if (yas > 60) {
                System.out.println("Emekli olabilirsin");
            } else {
                System.out.println("Emekli olamazsin " +  + (60 - yas) + "yil daha calisman gerekir");
            }

        } else if (cinsiyet == 'E') {
            if (yas < 0 || yas > 120) {
                System.out.println("lutfen girdiginiz yas degerini kontrol ediniz");
            } else if (yas > 65) {
                System.out.println("Emekli olabilirsin");
            } else {
                System.out.println("Emekli olamazsin " +  + (65 - yas) + "yil daha calisman gerekir");
            }

        } else {
            System.out.println("Lutfen cinsiyet icin gecerli bir harf giriniz");
        }


    }

}


