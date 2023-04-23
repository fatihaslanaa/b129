package day12loops;

import java.util.Scanner;

public class ForLoop01NT {
    public static void main(String[] args) {

        /*
              Asagida gordugunuz sekli console'a yazdiran kodu olusturunuz
                    X X X X X
                    X X X X X
                    X X X X X
        */


        Scanner input = new Scanner(System.in);

        System.out.println("Sutun(column) sayisini giriniz...");
        int column = input.nextInt();
         int row= input.nextInt();
        for (int i = 1; i<= row ; i++) {


            for (int j = 1; j <=column ; j++) {

                System.out.print("X ");

            }

            System.out.println();


















        }






        Scanner input1 = new Scanner(System.in);
        System.out.println("Satir(row) sayisini giriniz");
        int row1 = input1.nextInt();
        int column1=input1.nextInt();



        for (int i = 1; i <=row1 ; i++) {

            for (int j =1 ; j <=column1 ; j++) {

                System.out.print("* ");

            }
            System.out.println();

        }









    }
}
