package day03scanner;

import java.util.Scanner;

public class C04_Scanner {

    public static void main(String[] args) {

        // Ex Kullanicidan alacaginiz
        // 5 basamakli bir syidan ilk iki ve son iki
        // basamagindaki rakamlari toplamini yazdiran
        //kodu yaziniz

        //input 12345 ===> 1+2+4+5= 12
        //output===> = 12


        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen 5 basamakli bir sayi giriniz");


        int num= input.nextInt();//  sayimiz 12345
        int ilkIkiRkm=num/1000;
        System.out.println("ilkIkiRkm==>"+ilkIkiRkm);// ==>12


        int ilkIkiTop = (ilkIkiRkm % 10)+(ilkIkiRkm / 10);//3
        System.out.println("ilkIkiTop="+ ilkIkiTop);

        int sonIkiRkm= num % 100;
        System.out.println("sonIkiRkm="+ sonIkiRkm);//45

        int sonIKiRkmTop = (sonIkiRkm %10+sonIkiRkm/10);//9
        System.out.println("sonIkiTop" + sonIKiRkmTop);

        int toplam = ilkIkiTop +sonIKiRkmTop;//12
        System.out.println("Toplam" + toplam);


        // % bolumunden kalan sayiyi gosterir



        /// sondan ikinci rakami al

        //int lastSecondDigit = number%10;
        //number = number/10;

        /// sondan ucuncu rakami al

       // int lastThirdDigit = number%10;
       // number = number/10;

        /// sondan dorduncu rakami al

       //  int lastThirdDigit = number%10;

        //sondan besinci rakami al

        // int lastfifthDigit = number%10;

       // System.out.println(lastDigit + lastSecondDigit + lastfourthdigit + lastFifthDigit);









    }





}
