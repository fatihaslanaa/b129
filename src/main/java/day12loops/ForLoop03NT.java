package day12loops;

import java.util.Scanner;

public class ForLoop03NT {

    public static void main(String[] args) {


        /*
            Example 1: Asagidaki sekli cizdiren kodu yaziniz
                        * * * *
                        * * *
                        * *
                        *
         */


        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen satir numarasini giriniz");
        int row = input.nextInt();

        for (int i = 1; i <=row ; i++) {
            for (int j = row; j>i ; j--) {

                System.out.print("* ");

            }
            System.out.println();

        }









    }






}
