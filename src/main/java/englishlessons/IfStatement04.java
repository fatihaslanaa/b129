package englishlessons;

import java.util.Scanner;

public class IfStatement04 {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen bir character giriniz");
        int num = input.nextInt();

        //1.yol
        if (num % 2 == 0) {
            System.out.println("cift sayi");

        }

        if (num % 2 != 0) {
            System.out.println("Tek Sayi");
        }


        //2.yol


        if (num % 2 != 0) {
            System.out.println("Tek Sayi");
        }else {
            System.out.println("Tek Sayi...");
        }
    }
}


