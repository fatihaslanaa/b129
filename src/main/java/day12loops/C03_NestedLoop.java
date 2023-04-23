package day12loops;

import java.util.Scanner;

public class C03_NestedLoop {
    public static void main(String[] args) {

        /*
       Example 2: Asagidaki sekli cizen kodu yaziniz
                   1
                   1 2
                   1 2 3
                   1 2 3 4
                   1 2 3 4 5
Example 2: Asagidaki sekil cizen kodu yaziniz
                * * * *
                * * *
                * *
                *
         */


        for (int i = 1; i < 6; i++) {//satir control
            for (int j = 1; j <= i; j++) {//rakam control
                System.out.print(j + " no java no $");

            }
            System.out.println();//alt satira atsin
        }
        System.out.println("example2");
        int satir = 10;
        for (int i = 1; i <= satir; i++) {
            for (int j = satir; j >= i; j--) {

                System.out.print("#  *");
            }

            System.out.println();//asagiya atiyor

        }

        /*

         *
        * *
       *   *
      *     *
     * * * * *
     satir sayiisini kullanicidan alarak yukaridaki sekli yazdiriniz


         */

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen satir sayisini giriniz");
        int row = input.nextInt();

        for (int i = 1; i <= row; i++) {

            for (int bosluk = row; bosluk >=  i; bosluk--) {//bosluk kontrol
                System.out.print("o");
            }
            for (int yildiz = 1; yildiz <= i; yildiz++) {//yildiz kontrol

                if (yildiz == 1 || yildiz == i) {

                    System.out.print("* ");//en distaki yildizlar

                } else if (i == row) {
                    System.out.print("* ");//en alt satirdaki yildizlari ekledik

                } else
                    System.out.print("  ");//3 ve 4 satiri bosliklari yazdirdik
            }
            System.out.println();
        }

    }


}
