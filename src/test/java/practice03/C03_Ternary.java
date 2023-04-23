package practice03;

import java.util.Scanner;

public class C03_Ternary {
    public static void main(String[] args) {
        /*
        Kullanicidan sifirdan buyuk pozitif bir tam sayi girmesini isteyin
        Grilen pozitif tamsayi3 basamakli ise ekrana "3 basamakli " yazdirin
        3 bas degilse cift olup olmadigini kntrl edin
        cift ise "3 bas olmayan cift sayi " yazdrn
        cift dgilse "3 bas olmayan tek sayi " yazdrn

         */

        Scanner input = new Scanner(System.in);
        System.out.println("lutfen pozitif bir tam sayi giriniz");

        int sayi = input.nextInt();

        System.out.println("******** if ile cozumu**********");

        if(sayi>0){

            if(sayi >99 && sayi<1000){
                System.out.println("3 basamakli sayi");
            }

            }


        } {
            System.out.println("Pozitif bir tam sayi giriniz");
        }





    }

