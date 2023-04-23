package variablesdatetime01;

import java.util.Scanner;

public class C02_Variables {


    public static void main(String[] args) {


        Scanner input = new  Scanner (System.in);

        System.out.println("TechProEd Spor Salonuna hosgeldiniz");

        System.out.println("Lutfen isim ve Soyisim giriniz ");
        String isim = input.nextLine();


        System.out.println("Lutfen Yasinizi giriniz");
        byte yas = input.nextByte();


        System.out.println("Lutfen kilonuzu giriniz");
        double kilo = input.nextDouble();


        System.out.println("lutfen boyunuzu giriniz");
        double boy = input.nextDouble();


        int aylikucret = 20;
        System.out.println("aylikucret = " + aylikucret);


        System.out.println("Kac ay geleceginizi giriniz");
        int ay = input.nextInt();

          /*
           \n ==> alt satira gecirir
           \t ==> bir tab bosluk birakir
           \b ==> gerisindeki ilk harfi siler
           ctrl+ alt +l ==> windows icin sayfayi duzenler
            cmd + alt +l ==> mac icin sayfayi duzenler
           */




        int toplam_tutar =aylikucret*ay;
        System.out.println("toplam tutar ="+ toplam_tutar);
        System.out.println("\nIsminiz : " + isim + "\t" + "Yasiniz:"+ yas +
                "\t"+" Kilo" + kilo + " Boyunuz : " + boy+ "  Odemeniz gereken toplam tutar : " +
                toplam_tutar + "$");





    }




    }








