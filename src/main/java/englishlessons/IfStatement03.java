package englishlessons;

import java.util.Scanner;

public class IfStatement03 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen bir character giriniz");
        char ch = input.next().charAt(0);

        //   if (ch >= 'A' && ch <= 'Z') {
        //     System.out.println("buyuk Harf....");

        //   if (ch >= 'a' && ch <= 'z') {
        //     System.out.println("kucuk Harf....");

        //}


        //2.yol

        if (ch >= 'A' && ch <= 'Z') {
            System.out.println("buyuk Harf....");

        } else if(ch >= 'a' && ch <= 'z'){
            System.out.println("Kucuk harf...");
        }else {
            System.out.println("harf degil");
        }

    }}
