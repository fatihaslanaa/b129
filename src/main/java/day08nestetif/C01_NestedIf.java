package day08nestetif;

import java.util.Scanner;

public class C01_NestedIf {

    /*


    TASK: Kullanicidan 3 tane pozitif tamsayi alinzi
          Bu uc sayinin ucgen olusturma durumunu kontrol ediniz
          EGER UCGEN ISE "eskenar ucgen olma durmunu kontrol ediniz.



          INFO:
          Ucgen olma Sarti herhangi iki kenar toplami ucuncu kenardan buyuk olmali
                           herhangi iki kenar farki ucuncu kenardan kucuk olmali

           a+b>c.a-b
           a+c>b>a-c
           b+c>a>b-c

           a=b=c ise eskenar ucgen



           // Java nested kodlari calistirirken cok zaman harciyor *(Time Complexity)
           bu yuzden mumkunse Nested Kod yazilmamali.

     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen ucgenin 3 kenar uzunlugu giriniz");


        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        if (a + b > c && a - b < c && a + c > b && a - c < b && b + c > a && b - c < a) {//Ucgen olma durumu buyu if

            if (a == b && b == c && a == c) {
                System.out.println("eskenar ucgen ");
            } else {
                System.out.println("ucgen ama eskenar degil");
            }

        } else {//ucgen olmama durumu
            System.out.println("ucgen degillir");
        }
        // Kullanicidan bir ucgenin kenar uzunlugunu aliniz
        // Uc kenari birbirine esit ise "Eskenar Ucgen " yazdiriniz
        // Sadece iki kenar uzunlugu birbirine esit ise "Ikizkenar ucgen "
        //Tum kenarlari birbirinden farkli ise "Cesit kenar ucgen" yazdir

        System.out.println("Lutfen ucgenin 3 kenar uzunlugunu gir");

        int x = input.nextInt();
        int y = input.nextInt();
        int z = input.nextInt();

        if (x + y > z && x - y < z && x + z > y && x - z < y && y + z > x && y - z < x) {

            if (x == y && y == z) {
                System.out.println("Eskenar Ucgen");

            } else if (x == y || y == z || x == z) {

                System.out.println("IkizKenar Ucgen");
            } else {
                System.out.println("CesitKenar ucgen");
            }


        }else{
            System.out.println("ucgen degildir");
        }
    }
}
