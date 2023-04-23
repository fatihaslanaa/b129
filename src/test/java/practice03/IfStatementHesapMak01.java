package practice03;

import java.util.Scanner;

public class IfStatementHesapMak01 {
    public static void main(String[] args) {



        /*
        Kullanicidan alacaginiz 2 sayiyi yine kullaniciya
        sectireceginiz dort islemden biri ile
        isleme koyup yaziniz
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen \ntoplama yapmak icin 1 giriniz\n cikarma yapma icin 2 giriniz\ncarpma yapmak icin 3 giriniz\n bolme yapmak icin 4 giriniz");

        int islem = input.nextInt();
        System.out.println("Lutfen 2 Tam sayi giriniz");
        double num1 = input.nextDouble();//1.sayi assign edildi
        double num2 = input.nextDouble();//2.sayi assign edildi

        if (islem == 1) {
            System.out.println("Toplama Islemi sonucu:" + num1 + "+" + num2 + "=" + (num1 + num2));
        } else if (islem == 2) {
            System.out.println("Cikarma Islemi sonucu:" + num1 + "-" + num2 + "=" + (num1 - num2));

        } else if (islem == 3) {
            System.out.println("Carpma Islemi sonucu:" + num1 + "x" + num2 + "=" + (num1 * num2));

        } else if (islem == 4) {
            System.out.println("Bolme Islemi sonucu:" + num1 + "/" + num2 + "=" + (num1 / num2));

        } else
            System.out.println("Hatali secim yaptiniz tekrar deneyin");


    }
}
