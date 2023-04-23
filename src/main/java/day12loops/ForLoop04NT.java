package day12loops;

import java.util.Scanner;

public class ForLoop04NT {
    public static void main(String[] args) {


/*
        Example 1: Kullanicidan baslangic ve bitis degerlerini alin.
        Baslangic degerinden baslayip bitis degerine kadar aradaki tum cift tamsayilari ekrana yazdiriniz
        9 - 14 ==> 10  12  14
     */

        Scanner input = new Scanner(System.in);
        System.out.println("  baslangic degerini  giriniz");
        int start = input.nextInt();
        System.out.println("  bitis degerini  giriniz");
        int end = input.nextInt();
        if (start > end) {                // if else kullanici icin eger yalni deger girerse
            System.out.println("Baslangic degeri bitis degerinden kucuk olamaz...");
        } else {
            for (int i = start; i < end; i++) {

                if (i % 2 == 0) {
                    System.out.println(i + " ");

                }

            }

        }
    }
}

