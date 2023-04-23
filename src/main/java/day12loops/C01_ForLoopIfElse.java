package day12loops;

import java.util.Scanner;

public class C01_ForLoopIfElse {
    /*
    Kullanicidan baslangic ve bitis degerlerini alin
    baslangc degernden baslayip
    bitis degerine kadar tumtam sayilari
    ekrana yazdiriniz


     */
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen baslangis ve degerini giriniz");
        int baslangic = input.nextInt();
        System.out.println("Lutfen bitis degerini giriniz");
        int bitis = input.nextInt();

        if (baslangic > bitis) {
            System.out.println("Verdiginiz baslangc degeri bitis degerinde kucuk olmali ");
        } else {

        }
        for (int i = baslangic; i <= bitis; i++) {
            System.out.print(i + " ");

        }
        //Odec
        //Kullanicidan baslangic ve bitis degerlerini alin
        //baslangc degernden baslayip
        //bitis degerine kadar tum cift sayilari
        //ekrana yazdiriniz


    }
}
