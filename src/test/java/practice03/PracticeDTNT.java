package practice03;

import java.util.Scanner;

public class PracticeDTNT {
    public static void main(String[] args) {
        /*
        Kullanicidan bir gun alin
        Eger gun cuma ise "Muslumanlar icin mubarek gun"
        Eger gun cumartesi ise "Yahudilericin kutsal gun"
        Eger gun pazar ise "Hristiyanlaricin kutsal gun"
        yazdiran gunu olusturun
        Haricindeki hersey icin "Kutsal gun degildir"

         */


        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen gun ismi giriniz");

        String gun = input.next().toLowerCase();//kucuk harfe cevirdik

        if(gun.equals("cuma")){
            System.out.println("Muslumanlar icin mubarek gun");
        } else if (gun.equals("cumartesi")) {
            System.out.println("Yahudiler icin Kutsal gun ");

        }else if (gun.equals("pazar")) {
            System.out.println("Hristiyanlar icin Kutsal gun ");


        }else {
            System.out.println("Kutsal gun degildir");
        }

    }
}
