package day13whileloopdowhileloop;

import java.util.Scanner;

public class WhileLoop01 {
    public static void main(String[] args) {

        //Ex1: Kullanicidan verdigi sayi icin carpim tablosu olusturuo consola yazdiran kodu yaz

        Scanner input= new Scanner(System.in);
        System.out.println("Carpim tablosunu gormek icin bir sayi giriniz...");
        int num = input.nextInt();

        int i = 1;

        while (i<11){

            System.out.println(num + "x" + i + "=" + (num*i));


            i++;

        }

        System.out.println();

        //Ex2: Verilen bir Stringde her harfin sonrasina * sembolu ekleyiniz


        System.out.println("Bir kelime giriniz");
        String word = input.next();
        String newWord= "";

        int k = 0;

        while(k<word.length()){

           newWord=newWord + word.charAt(k)+ "*";

            k++;
        }
        System.out.print(newWord);

        //Ex3: 2.yol forloop yolu
        int a = 684;

        int toplam= 0;


        for (int m = a; m >0 ; m/=10) {

            toplam=toplam+m%10;

        }
        System.out.println(toplam);//19














    }

}
